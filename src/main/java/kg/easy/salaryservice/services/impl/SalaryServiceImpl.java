package kg.easy.salaryservice.services.impl;

import kg.easy.salaryservice.mappers.SalaryMapper;
import kg.easy.salaryservice.models.dtos.SalariesDto;
import kg.easy.salaryservice.models.entities.Salary;
import kg.easy.salaryservice.repository.SalaryRepo;
import kg.easy.salaryservice.services.SalaryService;
import org.springframework.stereotype.Service;


@Service
public class SalaryServiceImpl implements SalaryService {

    private SalaryRepo salaryRepo;

    public SalaryServiceImpl(SalaryRepo salaryRepo){
        this.salaryRepo = salaryRepo;
    }
    @Override
    public SalariesDto save(SalariesDto salariesDto) {
        Salary salary = SalaryMapper.INSTANCE.toSalary(salariesDto);
        System.out.println(salary);
        salary = salaryRepo.save(salary);
        return SalaryMapper.INSTANCE.toSalariesDto(salary);
    }
}
