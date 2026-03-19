package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${empId}")
    private Integer empId;
    @Value("${empName}")
    private String empName;
    @Value("${salary}")
    private double salary;
    @Value("${age}")
    private Integer age;
//    @Value("${bsu}")
//    private String businessUnit;

//    @Autowired
//    private SBU bu;

    public Employee(){}

    public Employee(Integer empId, String empName, double salary, Integer age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

//    public SBU getBu() {
//        return bu;
//    }
//
//    public void setBu(SBU bu) {
//        this.bu = bu;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void PrintDetails(){
        System.out.println("Employee Id: "+this.empId);
        System.out.println("Employee Name: "+this.empName);
        System.out.println("Employee Salary: "+this.salary);
//        System.out.println("Employee BU: "+this.businessUnit);
//        second problem
//        System.out.println("Employee BU: ");
//        System.out.println(bu);
        System.out.println("Employee Age: "+this.age);
    }

    @Override
    public String toString() {
        return "Employee: "+"["+empId + ", " + empName + ", " + salary + ", " + age+"]";
    }
}
