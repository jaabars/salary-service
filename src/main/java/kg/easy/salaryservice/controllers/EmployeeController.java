package kg.easy.salaryservice.controllers;


import kg.easy.salaryservice.models.dtos.EmployeeDto;
import kg.easy.salaryservice.models.entities.Employee;
import kg.easy.salaryservice.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public EmployeeDto save(@RequestBody EmployeeDto employeeDto){
        return employeeService.save(employeeDto);
    }

    @PutMapping("/update")
    public EmployeeDto update(@RequestBody EmployeeDto employeeDto){
        return employeeService.save(employeeDto);
    }

    @DeleteMapping("/delete")
    public EmployeeDto delete(@RequestParam Long id,@RequestParam boolean value){
        return employeeService.deleteEmployee(id,value);
    }

    @GetMapping("/get")
    public List<Employee> getEmployees(){
      //  return employeeService.getAll();
        return null;
    }
}
