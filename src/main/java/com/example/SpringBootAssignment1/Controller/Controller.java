package com.example.SpringBootAssignment1.Controller;

import com.example.SpringBootAssignment1.Model.Employee;
import com.example.SpringBootAssignment1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    // Create new employee
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // View all employees
    @GetMapping("/all")
    @Cacheable(value="employeeInfo")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // View employee by ID
    @GetMapping("/{employeeId}")
    @Cacheable(value="employeeInfo")
    public Employee findEmployeeById(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);

    }
    // Update an existing customer
    @PutMapping("/update/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(employeeId, updatedEmployee);
    }

    @DeleteMapping("/delete/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }

}
