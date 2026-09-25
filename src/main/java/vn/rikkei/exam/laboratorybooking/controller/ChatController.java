package vn.rikkei.exam.laboratorybooking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.rikkei.exam.laboratorybooking.dto.ChatRequest;
import vn.rikkei.exam.laboratorybooking.dto.ChatResponse;
import vn.rikkei.exam.laboratorybooking.service.chat.ChatService;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping({"/api/assistant/ask", "/api/chat"})
    public ResponseEntity<ChatResponse> ask(@RequestBody ChatRequest request) {
        ChatResponse response = chatService.chat(request);
        return ResponseEntity.ok(response);
    }
}
