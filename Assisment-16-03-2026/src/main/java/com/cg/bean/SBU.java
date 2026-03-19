package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SBU {
    @Value("${bu}")
    private String sbuId;

    @Value("${sbuName}")
    private String sbuName;

    @Value("${sbuHead}")
    private String sbuHead;
    @Autowired
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public SBU() {
    }

    public String getSbuId() {
        return sbuId;
    }

    public void setSbuId(String sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

//    public void addEmployee(Employee emp) {
//        this.employeeList.add(emp);
//    }
    public  void getSbu(){
        System.out.println("SBI ID: "+sbuId);
        System.out.println("SBU Name: "+sbuName);
        System.out.println("SBU Head: "+sbuHead);
        System.out.println("====Employee====");
        System.out.println(employeeList);
    }
    @Override
    public String toString() {
        return "sbu Details -" + "[" + "SBU code: " + this.sbuId + ", SBU Name: " + this.sbuName + ", SBU Head: " + this.sbuHead + "]";
    }
}
