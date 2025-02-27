package com.example.employeePayRole.controller;

import com.example.employeePayRole.entity.Employee;
import com.example.employeePayRole.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/empcontroller")
    public String print(){
        return "Demonstrate Employee Controller..";
    }

    @PostMapping("/add")
    public Employee addData(@Valid @RequestBody Employee employee){
        return employeeService.addData(employee);
    }

    @GetMapping("/get/{id}")
    public Employee getAllEmployee(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployeeByID(@PathVariable int id, @Valid @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeBYId(id);
    }


    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department){
        return employeeService.getEmployeesByDepartment(department);
    }
}
