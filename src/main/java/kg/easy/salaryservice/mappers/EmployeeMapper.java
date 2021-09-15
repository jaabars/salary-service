package kg.easy.salaryservice.mappers;

import kg.easy.salaryservice.models.dtos.EmployeeDto;
import kg.easy.salaryservice.models.entities.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    /***
     *Реализовать методы
     * employeeToEmployeeDto
     * employeeDtoToEmployee
     */

    //EmployeeDto toEmployeeDto(Employee employee)

    @Mappings({
            @Mapping(source = "employee.id",target = "employeeId"),
            @Mapping(source = "employee.name",target = "empName"),
            @Mapping(source = "employee.surName",target = "empSurName"),
            @Mapping(source = "employee.active",target = "empActive")

    })
    EmployeeDto toEmployeeDto(Employee employee);

    @Mappings({
            @Mapping(source = "employeeDto.employeeId",target = "id"),
            @Mapping(source = "employeeDto.empName",target = "name"),
            @Mapping(source = "employeeDto.empSurName",target = "surName"),
            @Mapping(source = "employeeDto.empActive", target = "active")
    })
    Employee toEmployee(EmployeeDto employeeDto);

}
