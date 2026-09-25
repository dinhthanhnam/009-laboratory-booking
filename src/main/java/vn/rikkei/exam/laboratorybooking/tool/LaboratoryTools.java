package vn.rikkei.exam.laboratorybooking.tool;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;
import vn.rikkei.exam.laboratorybooking.service.LaboratoryService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class LaboratoryTools {

    private final LaboratoryService laboratoryService;
    private final List<String> currentToolsUsed = new ArrayList<>();

    public synchronized void resetToolsUsed() {
        currentToolsUsed.clear();
    }

    public synchronized List<String> getToolsUsed() {
        return new ArrayList<>(currentToolsUsed);
    }

    private synchronized void recordTool(String name) {
        if (!currentToolsUsed.contains(name)) {
            currentToolsUsed.add(name);
        }
    }

    @Tool(name = "getLaboratoryAvailability", description = "Tra cứu tình trạng phòng thí nghiệm còn khả dụng theo khoảng ngày. Tham số: resourceType (STD hoặc PRM), startDate (yyyy-MM-dd), endDate (yyyy-MM-dd). startDate phải nhỏ hơn endDate.")
    public String getLaboratoryAvailability(String resourceType, String startDate, String endDate) {
        recordTool("getLaboratoryAvailability");
        try {
            LocalDate start = LocalDate.parse(startDate.trim());
            LocalDate end = LocalDate.parse(endDate.trim());
            return laboratoryService.getLaboratoryAvailability(resourceType, start, end);
        } catch (Exception e) {
            return "Lỗi tham số ngày hoặc định dạng: " + e.getMessage();
        }
    }

    @Tool(name = "createLaboratoryBookingRequest", description = "Tạo yêu cầu đặt phòng thí nghiệm mới ở trạng thái PENDING. Tham số: userId (vd USR-001), resourceType (STD hoặc PRM), startDate (yyyy-MM-dd), endDate (yyyy-MM-dd), participantCount, purpose (10-200 ký tự).")
    public String createLaboratoryBookingRequest(String userId, String resourceType, String startDate, String endDate, int participantCount, String purpose) {
        recordTool("createLaboratoryBookingRequest");
        try {
            LocalDate start = LocalDate.parse(startDate.trim());
            LocalDate end = LocalDate.parse(endDate.trim());
            return laboratoryService.createLaboratoryBookingRequest(userId, resourceType, start, end, participantCount, purpose);
        } catch (Exception e) {
            return "Lỗi tạo yêu cầu đặt phòng: " + e.getMessage();
        }
    }
}
