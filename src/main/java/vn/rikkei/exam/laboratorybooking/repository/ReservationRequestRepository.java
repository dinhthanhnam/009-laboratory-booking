package vn.rikkei.exam.laboratorybooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.rikkei.exam.laboratorybooking.model.ReservationRequest;
public interface ReservationRequestRepository extends JpaRepository<ReservationRequest, String> { }
