package vn.rikkei.exam.laboratorybooking.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.rikkei.exam.laboratorybooking.model.*;
import vn.rikkei.exam.laboratorybooking.repository.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LaboratoryService {

    private final AppUserRepository userRepository;
    private final ResourceTypeRepository resourceTypeRepository;
    private final ResourceInventoryRepository inventoryRepository;
    private final ReservationRequestRepository requestRepository;

    public String getLaboratoryAvailability(String resourceType, LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            return "Lỗi: startDate và endDate không được để trống.";
        }
        if (!startDate.isBefore(endDate)) {
            return "Lỗi: startDate phải nhỏ hơn endDate.";
        }

        Optional<ResourceType> typeOpt = resourceTypeRepository.findById(resourceType);
        if (typeOpt.isEmpty()) {
            return "Không tìm thấy loại phòng thí nghiệm: " + resourceType;
        }

        // Lấy danh sách tồn kho
        List<ResourceInventory> inventories = inventoryRepository.findAll().stream()
                .filter(inv -> inv.getResourceType() != null
                        && inv.getResourceType().getResourceCode().equalsIgnoreCase(resourceType)
                        && !inv.getAvailableDate().isBefore(startDate)
                        && !inv.getAvailableDate().isAfter(endDate))
                .toList();

        if (inventories.isEmpty()) {
            return "Không có dữ liệu lịch trống cho phòng " + resourceType + " từ ngày " + startDate + " đến " + endDate;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Tình trạng phòng ").append(resourceType).append(" từ ").append(startDate).append(" đến ").append(endDate).append(":\n");
        for (ResourceInventory inv : inventories) {
            sb.append("- Ngày ").append(inv.getAvailableDate())
              .append(": ").append(inv.getAvailableSlots()).append(" chỗ khả dụng\n");
        }
        return sb.toString();
    }

    @Transactional
    public String createLaboratoryBookingRequest(String userId, String resourceType, LocalDate startDate,
                                                 LocalDate endDate, int participantCount, String purpose) {
        // 1. Kiểm tra User
        Optional<AppUser> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return "Lỗi: Không tìm thấy người dùng với ID: " + userId;
        }

        // 2. Kiểm tra ngày
        if (startDate == null || endDate == null || !startDate.isBefore(endDate)) {
            return "Lỗi: startDate phải nhỏ hơn endDate.";
        }
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        if (days > 14) {
            return "Lỗi: Thời gian đặt phòng tối đa là 14 ngày. Số ngày yêu cầu: " + days;
        }

        // 3. Kiểm tra loại phòng
        Optional<ResourceType> typeOpt = resourceTypeRepository.findById(resourceType);
        if (typeOpt.isEmpty()) {
            return "Lỗi: Không tìm thấy loại phòng thí nghiệm: " + resourceType;
        }
        ResourceType resType = typeOpt.get();

        // 4. Kiểm tra sức chứa
        if (participantCount > resType.getMaxParticipants()) {
            return "Lỗi: Số người tham gia (" + participantCount + ") vượt quá sức chứa tối đa (" + resType.getMaxParticipants() + ") của phòng " + resourceType;
        }

        // 5. Kiểm tra nhóm PREMIUM tối thiểu 2 người
        boolean isPremium = "PRM".equalsIgnoreCase(resourceType) || (resType.getDisplayName() != null && resType.getDisplayName().toLowerCase().contains("premium"));
        if (isPremium && participantCount < 2) {
            return "Lỗi: Phòng nhóm PREMIUM yêu cầu tối thiểu 2 người tham gia.";
        }

        // 6. Kiểm tra purpose 10-200 ký tự
        if (purpose == null || purpose.trim().length() < 10 || purpose.trim().length() > 200) {
            return "Lỗi: Mục đích đặt phòng phải từ 10 đến 200 ký tự.";
        }

        // Tạo request với trạng thái PENDING
        String requestId = "REQ-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        ReservationRequest request = ReservationRequest.builder()
                .requestId(requestId)
                .requester(userOpt.get())
                .resourceType(resType)
                .startDate(startDate)
                .endDate(endDate)
                .participantCount(participantCount)
                .purpose(purpose.trim())
                .status(ReservationStatus.PENDING)
                .createdAt(Instant.now())
                .updatedAt(Instant.now())
                .build();

        requestRepository.save(request);

        return String.format("Tạo yêu cầu thành công! RequestId: %s | Tóm tắt: Người đặt: %s, Loại phòng: %s (%s), Thời gian: %s đến %s, Số người: %d, Trạng thái: PENDING.",
                requestId, userOpt.get().getFullName(), resType.getResourceCode(), resType.getDisplayName(), startDate, endDate, participantCount);
    }
}
