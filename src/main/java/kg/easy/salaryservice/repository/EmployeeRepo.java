package kg.easy.salaryservice.repository;

import kg.easy.salaryservice.models.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Long> {
}
