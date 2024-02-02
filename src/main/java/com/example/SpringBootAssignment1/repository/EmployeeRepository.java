package com.example.SpringBootAssignment1.repository;

import com.example.SpringBootAssignment1.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    // Creating an array list to encapsulate employees
    private final List<Employee> list = new ArrayList<>();

    // Getting the array list
    public List<Employee> getAllEmployees() {
        return list;
    }

    // Find employee by their employee id number
    public Employee findById(int id) {
        for (Employee e : list) {
            if (e.getEmployee_id() == id) {
                return e;
            }
        }
        return null;
    }

    // Creating an employee object and adding it to the employee arraylist
    public Employee save(Employee employee) {
        list.add(employee);
        return employee;
    }

    // Updating an existing employee using a new Employee object to record the updated entries
    public Employee updateEmployee(int employeeId, Employee updatedEmployee) {
        for (int i = 0; i < list.size(); i++) {
            Employee existingEmployee = list.get(i);
            if (existingEmployee.getEmployee_id() == employeeId) {
                existingEmployee.setName(updatedEmployee.getName());
                existingEmployee.setAddress(updatedEmployee.getAddress());
                return existingEmployee;
            }
        }
        throw new RuntimeException("Employee not found with id: " + employeeId);
    }

    // Deleting an employee by their id number
    public String deleteEmployee(int employeeId) {
        list.removeIf(employee -> employee.getEmployee_id() == employeeId);
        return "Customer with id " + employeeId + " has been deleted.";
    }
}



