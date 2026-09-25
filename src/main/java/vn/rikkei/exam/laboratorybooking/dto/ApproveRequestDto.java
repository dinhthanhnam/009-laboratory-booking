package vn.rikkei.exam.laboratorybooking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApproveRequestDto {
    private String requestId;
    private String decision; // APPROVE hoặc REJECT
    private String note;
}
