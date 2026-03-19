package OnetoManye.Practice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class deptMain {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();
//        em.getTransaction().begin();
//        department d=new department("Eco");
//        List<employee> li=new ArrayList<>();
//        li.add(new employee("Shreshtha",25000,d));
//        li.add(new employee("Samar",2500,d));
//        li.add(new employee("Vinay",26000,d));
//        li.add(new employee("Aarush",23000,d));
//        d.setEmp(li);
//        em.persist(d);
//        em.getTransaction().commit();
//        System.out.println("Table created.....");
        department d=em.find(department.class,1);
        System.out.println("===DEPT===");
        System.out.println(d.getDeptId());
        System.out.println(d.getName());
        System.out.println(d.getEmp());
        System.out.println("===EMP===");

    }
}
