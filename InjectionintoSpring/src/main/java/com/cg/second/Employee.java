package com.cg.second;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empId;
    private String name;
    private double Sal;
    private SBU businessUnit;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return Sal;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        Sal = sal;
    }

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void getEmp() {
        System.out.println("=========Second problem=========");
        System.out.println("id " + empId);
        System.out.println("Name of emp- " + name);
        System.out.println("Salary of emp " + Sal);
        System.out.println("SBU of emp : ");
        businessUnit.getSUB();
    }
}
