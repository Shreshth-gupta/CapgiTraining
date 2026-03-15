package com.cg.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SBU {
    private int sbuId;
    private String sbuName;
    private String sbuHead;
    public SBU() {
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

    public int getSbuId() {
        return sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void getSUB(){
        System.out.println("Sub id-"+sbuId);
        System.out.println("Sub head-"+sbuHead);
        System.out.println("Sub Name-"+sbuName);
    }
}
