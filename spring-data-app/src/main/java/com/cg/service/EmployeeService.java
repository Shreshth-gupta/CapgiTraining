package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeRepo erepo;

    public String createEmployee(Employee emp) {
        Employee e = erepo.saveAndFlush(emp);
        return "Employee created successfully" + e.getEmpid();
    }

    public List<Employee> getAllEmployee() {
        return erepo.findAll();
    }

    public Employee getEmployee(int id) {
        return erepo.findById(id).get();
    }

    public String removeEmployee(int empid) {
        Employee emp = erepo.findById(empid).orElseThrow(() -> new RuntimeException("Employee not found"));
        erepo.deleteById(empid);
        return "Employee Deleted by Id: " + empid;
    }

    public String updateEmployee(Employee e) {
//        Employee emp=erepo.findById(e.getEmpid()).orElseThrow(() -> new RuntimeException("Employee not found"));
//        emp.setName(e.getName());
//        emp.setDob(e.getDob());
//        emp.setSalary(e.getSalary());
        erepo.saveAndFlush(e);
        return "updated emplyee" + e.getEmpid();
    }

    public List<Employee> getEmployeeByName(String name){
        return erepo.findByNa(name);
    }

    public List<Employee> getEmployeeByWithGreaterSal(double sal){
        return erepo.findBySalaryGreaterThanEqual(sal);
    }

    public List<Employee> getEmployeeByDobBornInJan2005(int month){
        return erepo.findByDobBetween( LocalDate.of(2005, month, 1), LocalDate.of(2005, month, 30));
    }
}
