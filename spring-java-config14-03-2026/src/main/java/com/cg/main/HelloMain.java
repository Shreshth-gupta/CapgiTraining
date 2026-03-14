package com.cg.main;

import com.cg.beans.HelloWorld;
import com.cg.cfg.MyConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
    static void main(String[] args) {
    ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
//        BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld h =ctx.getBean(HelloWorld.class);
        HelloWorld h1 =ctx.getBean(HelloWorld.class);
        System.out.println(h==h1);
        System.out.println(h.sayHello());
        System.out.println(h1.sayHello());
    }
}
