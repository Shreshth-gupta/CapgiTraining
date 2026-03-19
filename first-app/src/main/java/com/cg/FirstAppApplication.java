package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan("com")
@PropertySource("classpath:data.properties")
public class FirstAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstAppApplication.class, args);
		ApplicationContext ctx= SpringApplication.run(FirstAppApplication.class,args);
//		HelloWorld h=ctx.getBean(HelloWorld.class);
//		System.out.println(h.sayhello("Shreshtha"));

		Employee e=ctx.getBean(Employee.class);
		e.printEmployeeDetails();
	}
}
