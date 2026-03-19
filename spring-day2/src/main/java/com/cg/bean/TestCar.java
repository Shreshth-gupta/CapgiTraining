package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Car c = (Car) ctx.getBean("car");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Entre EngineType etrol or CNG)");
//        String etype = sc.next();
//        System.out.println("Entre Tyre Choice MRF or JK)");
//        String tyre = sc.next();
//
//        IEngine e = (IEngine) ctx.getBean(etype.toLowerCase());
//        ITyre t = (ITyre) ctx.getBean(tyre.toLowerCase());
//        c.setEngine(e);
//        c.setTyre(t);
//        c.setName("Honda");
        c.printCar();
    }
}