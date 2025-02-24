package com.example.employeePayRole.services;

import com.example.employeePayRole.entity.Employee;
import com.example.employeePayRole.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    final EmployeeRepo employeeRepo;

    EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addData(Employee employee){
        return employeeRepo.save(employee);
    }
}
