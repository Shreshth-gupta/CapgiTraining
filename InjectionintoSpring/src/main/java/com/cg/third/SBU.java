package com.cg.third;

import java.util.List;

public class SBU {
    private int sbuId;
    private String sbuName;
    private String sbuHead;
    private List<Employee> empList;
    public SBU() {
    }

    public SBU(int sbuId, String sbuName, String sbuHead) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
    }

    public int getSbuId() {
        return sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
    public void getSBU(){
        System.out.println("=======Third Problem=======");
        System.out.println("subID: "+sbuId);
        System.out.println("sbuName: "+sbuName);
        System.out.println("sbuHead: "+sbuHead);
        System.out.println("List of Employee:");
        System.out.println(empList);
    }
}
