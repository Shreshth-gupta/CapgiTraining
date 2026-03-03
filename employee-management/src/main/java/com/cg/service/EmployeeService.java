package com.cg.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao dao=new EmployeeDao();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName()==null || emp.getName().length()<4 || emp.getEmail()==null ) {
			return "Invalid Employee Data";
		}
		else {
			Random r=new Random();
			String empid=emp.getName().substring(0,3)+r.nextInt(1000);
			emp.setEmpid(empid);
			return dao.saveEmployee(emp);
		}
	}

	@Override
	public Employee findById(int eid) throws SQLException {
			return dao.findEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		return dao.getAll();
	}

	@Override
	public String updateEmployeeName(int eid, String name) {
		return dao.updateEmployeeName(eid, name);
	}

	@Override
	public String removeEmployee(int empid) {
			return dao.deleteEmployee();
	}

}
