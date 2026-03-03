package com.cg.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeDao {
	public String saveEmployee(Employee emp);
	public Employee findEmployee(int empid) throws SQLException;
	public List<Employee> getAll() throws SQLException;
	public String updateEmployeeName(int empid, String newName);
	public String deleteEmployee();	
}
