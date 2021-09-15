package kg.easy.salaryservice.services;

import kg.easy.salaryservice.models.dtos.EmployeeDto;

public interface EmployeeService {
    EmployeeDto save(EmployeeDto employeeDto);

    EmployeeDto deleteEmployee(Long id, boolean value);
}
