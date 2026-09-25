package vn.rikkei.exam.laboratorybooking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRequest {
    private String message;
    private String conversationId;
    private String sessionId;

    public String getEffectiveConversationId() {
        if (conversationId != null && !conversationId.isBlank()) {
            return conversationId;
        }
        if (sessionId != null && !sessionId.isBlank()) {
            return sessionId;
        }
        return "default-conversation";
    }
}
