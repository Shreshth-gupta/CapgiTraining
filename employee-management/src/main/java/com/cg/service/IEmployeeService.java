package com.cg.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeService {
	public String createEmployee(Employee emp);
	public Employee findById(int eid) throws SQLException;
	public List<Employee> getAllEmployee() throws SQLException;
	public String updateEmployeeName(int eid,String name);
	public String removeEmployee(int empid);
}
