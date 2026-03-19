package Service;

import com.cg.first.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        First
        com.cg.first.Employee e1 = (com.cg.first.Employee) ctx.getBean("employee1");
        e1.getEmp();
        System.out.println("");
//        Second
        com.cg.second.Employee e2 = (com.cg.second.Employee) ctx.getBean("employee2");
        e2.getEmp();
        System.out.println("");
//        Third
        com.cg.third.SBU s=(com.cg.third.SBU) ctx.getBean("sbu1");
        s.getSBU();
        System.out.println("");
    }
//    Fourth
    Scanner sc =new Scanner(System.in);
    List<Employee> employeeList =new ArrayList<>();
    public void addEmployee(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println("Enter id: ");
        Integer empId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String empName = sc.nextLine();
        System.out.println("Enter Salary: ");
        Double sal = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Age: ");
        Integer age = sc.nextInt();
        sc.nextLine();

        emp.setName(empName);
        emp.setAge(age);
        emp.setEmpId(empId);
        emp.setSal(sal);

        employeeList.add(empId,emp);
    }

}
