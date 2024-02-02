package com.example.SpringBootAssignment1.Model;

public class Employee {

    private int employee_id;
    private String name;
    private String address;

    public Employee(int employee_id, String name, String address) {
        this.employee_id = employee_id;
        this.name = name;
        this.address = address;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

