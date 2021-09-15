package kg.easy.salaryservice.services.impl;

import antlr.debug.SemanticPredicateListener;
import kg.easy.salaryservice.mappers.EmployeeMapper;
import kg.easy.salaryservice.models.dtos.EmployeeDto;
import kg.easy.salaryservice.models.entities.Employee;
import kg.easy.salaryservice.repository.EmployeeRepo;
import kg.easy.salaryservice.services.EmployeeService;
import lombok.val;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        /**
         * получаем employeeDto -> employee
         * обратиться в employeeRepo.save(employee)
         * вернуть employee->employeeDto
         */

        //employeeRepo.save(employee);
        //employeeRepo.save(employeeDto); это неверно
        Employee employee = EmployeeMapper.INSTANCE.toEmployee(employeeDto);
        employee = employeeRepo.save(employee);
        return EmployeeMapper.INSTANCE.toEmployeeDto(employee);
    }

    @Override
    public EmployeeDto deleteEmployee(Long id, boolean value) {
        Employee employee = employeeRepo.findById(id).get();
        employee.setActive(value);
        employee = employeeRepo.save(employee);
        return EmployeeMapper.INSTANCE.toEmployeeDto(employee);
    }
}