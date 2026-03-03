package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

import java.sql.SQLException;

public class EmployeeMain {

	public static void main(String[] args) {
        try {
			IEmployeeService es=new EmployeeService();
			String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
			System.out.println(result);
			Employee emp= null;
			emp = es.findById(1);
			System.out.println(emp);
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

}
