//package com.example.employeePayRole.controller;
//
//import com.example.employeePayRole.entity.Employee;
//import com.example.employeePayRole.services.EmployeeServiceByList;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/employees")
//public class EmployeeControllerByList {
//
//    private EmployeeServiceByList employeeService;
//    EmployeeControllerByList(EmployeeServiceByList employeeServiceByList){
//        this.employeeService=employeeServiceByList;
//    }
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping("/{id}")
//    public Employee getEmployeeById(@PathVariable Integer id) {
//        return employeeService.getEmployeeById(id);
//    }
//
//    @PostMapping
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return employeeService.saveEmployee(employee);
//    }
//
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
//        return employeeService.updateEmployee(id, employee);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteEmployee(@PathVariable Integer id) {
//        employeeService.deleteEmployee(id);
//        return "Employee deleted successfully";
//    }
//}
//
