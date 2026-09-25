package vn.rikkei.exam.laboratorybooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.rikkei.exam.laboratorybooking.model.AppUser;
public interface AppUserRepository extends JpaRepository<AppUser, String> { }
