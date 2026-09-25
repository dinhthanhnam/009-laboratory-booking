package vn.rikkei.exam.laboratorybooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.rikkei.exam.laboratorybooking.model.ResourceType;
public interface ResourceTypeRepository extends JpaRepository<ResourceType, String> { }
