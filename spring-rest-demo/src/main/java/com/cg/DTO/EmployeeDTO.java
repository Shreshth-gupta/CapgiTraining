package com.cg.DTO;

import java.time.LocalDate;

public class EmployeeDTO {
    private int employeeid;
    private String name;
    private LocalDate dob;
    private double salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeid, String name, LocalDate dob, double salary) {
        this.employeeid = employeeid;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
