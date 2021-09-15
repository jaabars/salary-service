package kg.easy.salaryservice.models.dtos;

import kg.easy.salaryservice.models.entities.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
public class SalariesDto {

    Long id;
    Double salary;
    Date startDate;
    Date endDate;
    EmployeeDto employee;
}
