package com.cg.main;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {
//		Employee emp=new Employee();
////		emp.setAddress(new Address());
//		emp.printEmployeeDetail();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = (Employee) ctx.getBean("e");
        emp.printEmployeeDetail();
    }

}
