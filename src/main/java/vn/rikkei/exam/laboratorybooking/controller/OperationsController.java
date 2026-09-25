package vn.rikkei.exam.laboratorybooking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.rikkei.exam.laboratorybooking.dto.ApproveRequestDto;
import vn.rikkei.exam.laboratorybooking.service.LaboratoryService;

@RestController
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class OperationsController {

    private final LaboratoryService laboratoryService;

    @PostMapping("/approve-request")
    public ResponseEntity<String> approveRequest(@RequestBody ApproveRequestDto dto) {
        if (dto.getRequestId() == null || dto.getDecision() == null) {
            return ResponseEntity.badRequest().body("requestId và decision không được để trống.");
        }
        String result = laboratoryService.approveOrRejectRequest(dto.getRequestId(), dto.getDecision(), dto.getNote());
        if (result.startsWith("Lỗi")) {
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.ok(result);
    }
}
