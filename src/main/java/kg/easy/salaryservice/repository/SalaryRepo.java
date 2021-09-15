package kg.easy.salaryservice.repository;

import kg.easy.salaryservice.models.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepo  extends JpaRepository<Salary,Long> {
}
