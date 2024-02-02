package com.example.SpringBootAssignment1.service;

import com.example.SpringBootAssignment1.Model.Employee;
import com.example.SpringBootAssignment1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
        return employeeRepository.updateEmployee(employeeId, updatedEmployee);
    }

    public String deleteEmployee(int employeeId) {
        return employeeRepository.deleteEmployee(employeeId);
    }
}

