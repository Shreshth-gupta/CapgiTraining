package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${empid}")
    private int empId;
    @Value("${ename}")
    private String name;
    @Autowired
//    @Qualifier("addr")
    private Address address;

    public Employee() {
    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public Employee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeDetail() {
        System.out.println("Employee id- " + empId);
        System.out.println("Employee Name- " + name);
        System.out.println("Employee Address city- " + address.getCity());
        System.out.println("Employee Address Country- " + address.getCountry());
        System.out.println("Employee Address ZipCode- " + address.getZip());
    }
}
