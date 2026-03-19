package com.cg.service;


import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService implements IEmployeeService {
    Scanner sc =new Scanner(System.in);
    @Autowired
    private IEmployeeRepo repo;

    @Override
    public List<Employee> getAllEmployee(){
        return  repo.findAll();
    }

    @Override
    public Employee creteEmployee(Employee e) {
        return repo.saveAndFlush(e);
    }

    @Override
    public Employee getEmployeeid(int empid) {
        return repo.findById(empid).get();
    }

    @Override
    public String removeEmployee(int empid) {
        if(repo.findById(empid).get()!=null){
            repo.deleteById(empid);
            return "Employee Deleted by Id: " + empid;
        }else {
            return "no such employee: "+empid;
        }
    }

    @Override
    public Employee updateEmployee(Employee e) {
        Employee emp = null;
        Employee existing = repo.findById(emp.getEmpid()).orElse(null);
        if(existing != null) {
            repo.saveAndFlush(e);
        }else{
            return e;
        }
        return e;
    }
    public List<Employee> getEmployeeByName(String name){
        return repo.findByName(name);
    }

}
