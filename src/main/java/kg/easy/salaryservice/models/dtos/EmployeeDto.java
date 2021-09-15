package kg.easy.salaryservice.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    Long employeeId;
    String empName;
    String empSurName;
    boolean empActive;
}
