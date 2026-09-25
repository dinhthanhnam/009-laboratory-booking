package vn.rikkei.exam.laboratorybooking.service.chat;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.document.Document;
import org.springframework.stereotype.Service;
import vn.rikkei.exam.laboratorybooking.dto.ChatRequest;
import vn.rikkei.exam.laboratorybooking.dto.ChatResponse;
import vn.rikkei.exam.laboratorybooking.service.rag.RagService;
import vn.rikkei.exam.laboratorybooking.tool.LaboratoryTools;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatService {

    private final ChatClient chatClient;
    private final RagService ragService;
    private final LaboratoryTools laboratoryTools;
    private final ChatMemory chatMemory;

    public ChatResponse chat(ChatRequest request) {
        String userMessage = request.getMessage() != null ? request.getMessage().trim() : "";
        String sessionId = (request.getSessionId() != null && !request.getSessionId().isBlank())
                ? request.getSessionId()
                : "default-session";

        // Reset danh sách tool đã gọi
        laboratoryTools.resetToolsUsed();

        // 1. RAG Retrieval
        List<Document> relevantDocs = ragService.search(userMessage);
        List<String> sources = new ArrayList<>();
        StringBuilder contextBuilder = new StringBuilder();

        for (Document doc : relevantDocs) {
            contextBuilder.append(doc.getText()).append("\n\n");
            Object src = doc.getMetadata().get("source");
            if (src != null && !sources.contains(src.toString())) {
                sources.add(src.toString());
            }
        }

        // 2. System prompt chuẩn fallback
        String systemPrompt = """
                Bạn là trợ lý ảo hỗ trợ đặt phòng thí nghiệm.
                
                Dưới đây là tài liệu nội bộ liên quan:
                %s
                
                QUY TẮC BẮT BUỘC:
                1. Đối với các câu hỏi về thông tin, quy định, chính sách hoặc tiêu chuẩn: CHỈ dựa trên tài liệu nội bộ ở trên. Nếu tài liệu trên không có hoặc không đủ căn cứ trả lời, bạn BẮT BUỘC phải trả lời chính xác từng chữ: "Không đủ căn cứ trong tài liệu nội bộ." Tuyệt đối không suy đoán.
                2. Đối với các yêu cầu kiểm tra lịch trống hoặc đặt phòng: BẮT BUỘC gọi các tool tương ứng (getLaboratoryAvailability, createLaboratoryBookingRequest), không tự suy đoán dữ liệu.
                """.formatted(contextBuilder.length() > 0 ? contextBuilder.toString() : "(Không có tài liệu phù hợp)");

        // 3. Thực thi ChatClient
        String answer;
        try {
            answer = chatClient.prompt()
                    .system(systemPrompt)
                    .user(userMessage)
                    .tools(laboratoryTools)
                    .advisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                    .advisors(a -> a.param("chat_memory_conversation_id", sessionId))
                    .call()
                    .content();
        } catch (Exception e) {
            log.error("Error during chat processing: {}", e.getMessage(), e);
            answer = "Đã xảy ra lỗi khi xử lý: " + e.getMessage();
        }

        List<String> toolsUsed = laboratoryTools.getToolsUsed();

        // Fallback: Nếu câu trả lời là "Không đủ căn cứ trong tài liệu nội bộ." thì xóa sources
        if (answer != null && answer.contains("Không đủ căn cứ trong tài liệu nội bộ.")) {
            sources.clear();
        }

        return ChatResponse.builder()
                .answer(answer)
                .toolsUsed(toolsUsed)
                .sources(sources)
                .build();
    }
}
