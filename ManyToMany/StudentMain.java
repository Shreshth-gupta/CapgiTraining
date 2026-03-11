package ManyToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashSet;
import java.util.Set;

public class StudentMain{
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
//        em.getTransaction().begin();
//        Student s=new Student("Shreshtha");
//        Course c=em.find(Course.class,2);
//        Set<Course> li=new HashSet<Course>();
//        li.add(c);
//        s.setCources(li);
//        em.persist(s);
//        System.out.println("Created...");
//        em.getTransaction().commit();
    }
}
