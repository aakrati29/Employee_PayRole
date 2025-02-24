package com.example.employeePayRole.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/empcontroller")
    public String print(){
        return "Demonstrate Employee Controller..";
    }
}
