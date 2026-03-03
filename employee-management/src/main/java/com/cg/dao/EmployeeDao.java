package com.cg.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;

public class EmployeeDao implements IEmployeeDao{
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Jack@1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(int empid){
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee where empid=?");
			ps.setInt(1, empid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Employee emp = new Employee(rs.getString("name"), rs.getString("email"), rs.getString("dob"));
				emp.setEmpid(rs.getString("empid"));
				return emp;
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	@Override
	public List<Employee> getAll() throws SQLException {
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			List<Employee> list=new ArrayList<>();
			while(rs.next()) {
				Employee emp=new Employee(rs.getString("name"), rs.getString("email"), rs.getString("dob"));
				emp.setEmpid(rs.getString("empid"));
				list.add(emp);
			}
			return list;
    }

	@Override
	public String updateEmployeeName(int empid, String newName) {
		try {
			PreparedStatement ps=con.prepareStatement("update employee set name=? where empid=?");
			ps.setString(1, newName);
			ps.setInt(2, empid);
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Updated";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Employee Not Updated";
	}

	@Override
	public String deleteEmployee() {
		try {
			PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
			ps.setInt(1, 101);
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Deleted";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Employee Not Deleted";
	}

}
