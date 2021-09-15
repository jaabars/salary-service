package kg.easy.salaryservice.mappers;

import kg.easy.salaryservice.models.dtos.SalariesDto;
import kg.easy.salaryservice.models.entities.Salary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalaryMapper {

    SalaryMapper INSTANCE = Mappers.getMapper(SalaryMapper.class);

    @Mapping(source = "salariesDto.employee.employeeId",target = "employee.id")
    Salary toSalary(SalariesDto salariesDto);

    @Mapping(source = "salary.employee.id",target = "employee.employeeId")
    SalariesDto toSalariesDto(Salary salary);

    /**
     *
     * реализовать
     * salaryToSalaryDto
     * salaryDtoToSalary
     */
}
