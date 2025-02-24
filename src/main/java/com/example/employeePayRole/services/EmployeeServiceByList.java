package com.example.employeePayRole.services;

import com.example.employeePayRole.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceByList {
    final List<Employee> employeeList = new ArrayList<>();

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Get employee by ID
    public Employee getEmployeeById(Integer id) {
        return employeeList.stream()
                .filter(emp -> emp.getId().equals(id)) // Ensure emp.getId() is Integer
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    // Save (Add) employee
    public Employee saveEmployee(Employee employee) {
        employee.setId((Integer) (employeeList.size() + 1)); // Auto-increment ID
        employeeList.add(employee);
        return employee;
    }

    // Update employee
    public Employee updateEmployee(Integer id, Employee updatedEmployee) { // Change Long to Integer
        Optional<Employee> existingEmployeeOpt = employeeList.stream()
                .filter(emp -> emp.getId().equals(id)) // Ensure ID type matches
                .findFirst();

        if (existingEmployeeOpt.isPresent()) {
            Employee existingEmployee = existingEmployeeOpt.get();
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setSalary(updatedEmployee.getSalary());
            return existingEmployee;
        } else {
            throw new RuntimeException("Employee not found");
        }
    }

    // Delete employee
    public void deleteEmployee(Integer id) { // Change Long to Integer
        employeeList.removeIf(emp -> emp.getId().equals(id));
    }
}
