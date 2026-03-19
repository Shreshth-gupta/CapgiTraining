package com.cg.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.HelloWorld;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//		HelloWorld h1 = (HelloWorld)ctx.getBean("hello");
//		System.out.println(h1);
//		h1.setName("Vinay");
//		System.out.println(h==h1);
//		System.out.println(h1.sayHello());
//		h.setName("Priya");
		
		HelloWorld h = (HelloWorld)ctx.getBean("hello");
		
		System.out.println(h.sayHello());
		System.out.println("=====Langugae====");
		System.out.println(h.getCourse());
		
		((ClassPathXmlApplicationContext)ctx).close();

	}
}
