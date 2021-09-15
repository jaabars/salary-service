package kg.easy.salaryservice.controllers;

import kg.easy.salaryservice.models.dtos.SalariesDto;
import kg.easy.salaryservice.services.SalaryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/salary")
public class SalaryController {

    private SalaryService salaryService;
    public SalaryController(SalaryService salaryService){
        this.salaryService = salaryService;
    }
    @PostMapping("/save")
    public SalariesDto save(@RequestBody SalariesDto salariesDto){
        /**
         *прежде чем сохранить вам нужно найти текущую зарплату
         *  setEndDate(new Date);
         *  save(текущая зарплата)
         *сохранить новую зарплату
         */

        return salaryService.save(salariesDto);
    }
    /*
    * получить зарплату сотрудника по id
    * */
}
