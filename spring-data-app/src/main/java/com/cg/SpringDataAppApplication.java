package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);
        EmployeeService es = ctx.getBean(EmployeeService.class);

        IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
//        erepo.save(new Employee("Shreshtha", LocalDate.of(2002, 10, 12), 56000));
//        System.out.println("Employee created......");

        System.out.println("**************************************************");
//        System.out.println(es.getAllEmployee());
//        System.out.println(es.createEmployee(new Employee("Pragya",LocalDate.of(2003,10,12),25000)));

//        System.out.println(es.getEmployee(102));
//        System.out.println(es.removeEmployee(102));

//        Employee e = es.getEmployee(102);
//        e.setName("Shristy");
//        System.out.println(es.updateEmployee(e));


//        erepo.save(new Employee("Shyam", LocalDate.of(2002, 10, 12), 56000));
//        erepo.save(new Employee("amanan", LocalDate.of(2003, 11, 13), 548480));
//        erepo.save(new Employee("Dristy", LocalDate.of(2004, 12, 25), 4164));
//        erepo.save(new Employee("Ram", LocalDate.of(2005, 8, 21), 144924));
//        erepo.save(new Employee("aarush", LocalDate.of(2005, 2, 12), 6284949));

//        es.getEmployeeByName("aarush").forEach(s->{
//            System.out.println(s);
//        });

//        System.out.println(es.getEmployeeByWithGreaterSal(50000));

        System.out.println(es.getEmployeeByDobBornInJan2005(1));
        System.out.println(es.getAllEmployee());
        System.out.println("**************************************************");
    }
}