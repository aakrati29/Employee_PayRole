package com.example.employeePayRole.services;

import com.example.employeePayRole.entity.Employee;
import com.example.employeePayRole.repository.EmployeeRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
        return employeeRepo.findById(id).orElseThrow(()->new RuntimeException("exception handle"));
    }

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(int id, Employee updated){
        Employee old = getEmployeeByID(id);
        old.setName(updated.getName());
        old.setSalary(updated.getSalary());
        old.setPhoneNumber(updated.getPhoneNumber());

        return employeeRepo.save(old);
    }

    public void deleteEmployeeBYId(int id){
         employeeRepo.deleteById(id);
    }

}
