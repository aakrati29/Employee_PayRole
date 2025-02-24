package com.example.employeePayRole.repository;

import com.example.employeePayRole.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
