package com.cg.service;

import com.cg.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();
    public Employee creteEmployee(Employee e);
    public Employee getEmployeeid(int empid);
    public String removeEmployee(int empid);
    public Employee updateEmployee(Employee e);
}
