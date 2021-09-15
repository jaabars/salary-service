package kg.easy.salaryservice.services;

import kg.easy.salaryservice.models.dtos.SalariesDto;

public interface SalaryService {
    SalariesDto save(SalariesDto salariesDto);
}
