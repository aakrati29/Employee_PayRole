package com.example.employeePayRole.services;

import com.example.employeePayRole.entity.Employee;
import com.example.employeePayRole.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Slf4j
@Service
public class EmployeeService {

    final EmployeeRepo employeeRepo;

    EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addData(Employee employee){
        return employeeRepo.save(employee);
    }


    public Employee getEmployeeByID(int id){
        log.info("Fetching employee by id{}", id);
        return employeeRepo.findById(id).orElseThrow(()->new RuntimeException("exception handle"));
    }

    public List<Employee> getAllEmployee(){
        log.info("Fetching all Employee from dataBase");
        return employeeRepo.findAll();
    }


    public Employee updateEmployee(int id, Employee updated){
        Employee old = getEmployeeByID(id);
        old.setName(updated.getName());
        old.setSalary(updated.getSalary());
        old.setPhoneNumber(updated.getPhoneNumber());

        log.info("Employee details are updated");
        return employeeRepo.save(old);
    }


    public void deleteEmployeeBYId(int id){
        log.info("Delete employee by id{}", id);
        employeeRepo.deleteById(id);
    }

    public List<Employee> getEmployeesByDepartment(String department){
        log.info("Fetching employees from {} department", department);
        return employeeRepo.findEmployeesByDepartment(department);
    }
}
