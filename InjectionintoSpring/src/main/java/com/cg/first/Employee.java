package com.cg.first;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empId;
    private String name;
    private double Sal;
    private String businessUnit;
    private int age;

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

    public String getBusinessUnit() {
        return businessUnit;
    }

    public int getAge() {
        return age;
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

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getEmp() {
        System.out.println("id " + empId);
        System.out.println("Name of emp- " + name);
        System.out.println("Salary of emp " + Sal);
        System.out.println("BussnessUnit " + businessUnit);
        System.out.println("Age of emp " + age);
    }
}
