package jPA.Employee.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;
public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        PEmployee obj1 = new PEmployee();
        CEmployee obj = new CEmployee();
        obj.setName("Shreshtha");
        obj.setDob(LocalDate.of(2002, 10, 04));
        obj1.setSalary(300000);
        obj.setPay_per_hour(2000);
        em.persist(obj1);
        em.persist(obj);
        em.getTransaction().commit();
        System.out.println("Created...");
    }
}