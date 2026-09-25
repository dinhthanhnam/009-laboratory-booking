package vn.rikkei.exam.laboratorybooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.rikkei.exam.laboratorybooking.model.ResourceInventory;
public interface ResourceInventoryRepository extends JpaRepository<ResourceInventory, Long> { }
