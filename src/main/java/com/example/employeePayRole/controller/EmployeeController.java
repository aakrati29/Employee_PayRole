package com.example.employeePayRole.controller;

import com.example.employeePayRole.entity.Employee;
import com.example.employeePayRole.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

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
    public Employee addData(@RequestBody Employee employee){
        return employeeService.addData(employee);
    }
}
