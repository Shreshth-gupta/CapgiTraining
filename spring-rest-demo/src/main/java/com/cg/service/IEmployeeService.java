package com.cg.service;

import com.cg.DTO.EmployeeDTO;
import com.cg.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();
    public EmployeeDTO creteEmployee(Employee e);
    public EmployeeDTO getEmployeeid(int empid);
    public String removeEmployee(int empid);
    public EmployeeDTO updateEmployee(Employee e);
    public List<EmployeeDTO> getEmployeeByName(String name);
}
