package com.cg.third;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int empId;
    private String name;
    private double Sal;

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

    @Override
    public String toString() {
        return "\n"+"Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Sal=" + Sal +
                '}';
    }
}
