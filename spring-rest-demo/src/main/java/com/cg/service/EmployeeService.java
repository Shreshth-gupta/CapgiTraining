package com.cg.service;


import com.cg.DTO.EmployeeDTO;
import com.cg.DTO.EntityMapper;
import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public EmployeeDTO creteEmployee(Employee e) {
        repo.saveAndFlush(e);
        return EntityMapper.convertEntityToDto(e);
    }

    @Override
    public EmployeeDTO getEmployeeid(int empid) {
        Employee op= repo.findById(empid).get();
        if(op!=null){
            return EntityMapper.convertEntityToDto(op);
        }else
            return null;
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
    public EmployeeDTO updateEmployee(Employee e) {
        Employee emp = null;
        Employee existing = repo.findById(emp.getEmpid()).orElse(null);
        EmployeeDTO ed= EntityMapper.convertEntityToDto(e);
        if(existing != null) {
            repo.saveAndFlush(e);
        }else{
            return ed;
        }
        return ed;
    }
    @Override
    public List<EmployeeDTO> getEmployeeByName(String name){
        List<Employee> emps=repo.findByName(name);
        List<EmployeeDTO> employee=new ArrayList<EmployeeDTO>();
        emps.forEach(e->employee.add(EntityMapper.convertEntityToDto(e)));
        return employee;
    }

}
