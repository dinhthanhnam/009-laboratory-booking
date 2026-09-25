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
        Optional<AppUser> userOpt = userRepository.findById(userId);
        if (userOpt.isEmpty()) {
            return "Lỗi: Không tìm thấy người dùng với ID: " + userId;
        }

        if (startDate == null || endDate == null || !startDate.isBefore(endDate)) {
            return "Lỗi: startDate phải nhỏ hơn endDate.";
        }
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        if (days > 14) {
            return "Lỗi: Thời gian đặt phòng tối đa là 14 ngày. Số ngày yêu cầu: " + days;
        }

        Optional<ResourceType> typeOpt = resourceTypeRepository.findById(resourceType);
        if (typeOpt.isEmpty()) {
            return "Lỗi: Không tìm thấy loại phòng thí nghiệm: " + resourceType;
        }
        ResourceType resType = typeOpt.get();

        if (participantCount > resType.getMaxParticipants()) {
            return "Lỗi: Số người tham gia (" + participantCount + ") vượt quá sức chứa tối đa (" + resType.getMaxParticipants() + ") của phòng " + resourceType;
        }

        boolean isPremium = "PRM".equalsIgnoreCase(resourceType) || (resType.getDisplayName() != null && resType.getDisplayName().toLowerCase().contains("premium"));
        if (isPremium && participantCount < 2) {
            return "Lỗi: Phòng nhóm PREMIUM yêu cầu tối thiểu 2 người tham gia.";
        }

        if (purpose == null || purpose.trim().length() < 10 || purpose.trim().length() > 200) {
            return "Lỗi: Mục đích đặt phòng phải từ 10 đến 200 ký tự.";
        }

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

    @Transactional
    public String approveOrRejectRequest(String requestId, String decision, String note) {
        Optional<ReservationRequest> reqOpt = requestRepository.findById(requestId);
        if (reqOpt.isEmpty()) {
            return "Lỗi: Không tìm thấy yêu cầu đặt phòng với requestId: " + requestId;
        }

        ReservationRequest request = reqOpt.get();
        if (request.getStatus() != ReservationStatus.PENDING) {
            return "Lỗi: Chỉ xử lý yêu cầu ở trạng thái PENDING. Trạng thái hiện tại: " + request.getStatus();
        }

        if ("APPROVE".equalsIgnoreCase(decision)) {
            // Tái kiểm tra nghiệp vụ trước APPROVE
            if (!request.getStartDate().isBefore(request.getEndDate())) {
                return "Lỗi: startDate không nhỏ hơn endDate.";
            }
            long days = ChronoUnit.DAYS.between(request.getStartDate(), request.getEndDate());
            if (days > 14) {
                return "Lỗi: Vượt quá số ngày cho phép tối đa 14 ngày.";
            }
            if (request.getParticipantCount() > request.getResourceType().getMaxParticipants()) {
                return "Lỗi: Vượt quá sức chứa tối đa.";
            }

            request.setStatus(ReservationStatus.APPROVED);
            request.setDecisionNote(note);
            request.setUpdatedAt(Instant.now());
            requestRepository.save(request);
            return "Phê duyệt yêu cầu thành công: " + requestId;
        } else if ("REJECT".equalsIgnoreCase(decision)) {
            request.setStatus(ReservationStatus.REJECTED);
            request.setDecisionNote(note);
            request.setUpdatedAt(Instant.now());
            requestRepository.save(request);
            return "Từ chối yêu cầu thành công: " + requestId;
        } else {
            return "Lỗi: Quyết định không hợp lệ. Chỉ chấp nhận APPROVE hoặc REJECT.";
        }
    }
}
