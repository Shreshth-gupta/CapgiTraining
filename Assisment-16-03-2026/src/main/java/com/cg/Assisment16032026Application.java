package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@SpringBootApplication
//@ComponentScan("com")
@PropertySource("classpath:data.properties")
public class Assisment16032026Application {
Scanner sc=new Scanner(System.in);
    @Bean
    public Employee getEmployee() {
        System.out.println("enter the Employee ID");
        int id=sc.nextInt();
        System.out.println("enter the Employee Name");
        String name=sc.nextLine();
        System.out.println("enter the Employee Salary");
        int Sal=sc.nextInt();
        System.out.println("enter the Employee age");
        int age=sc.nextInt();
        return new Employee(id, name, Sal, age);
    }
//    @Bean
//    public Employee getEmployee1(){
//        return new Employee(103,"Samar",2500,25);
//    }@Bean
//    public Employee getEmployee2(){
//        return new Employee(103,"Samar",2500,25);
//    }

    public static void main(String[] args) {

        ApplicationContext ctx= SpringApplication.run(Assisment16032026Application.class,args);
//        SBU s=ctx.getBean(SBU.class);
//        s.getSbu();
        Employee e=ctx.getBean(Employee.class);
        e.PrintDetails();

    }
}
