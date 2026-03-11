package oneTonne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class PersionMain {
    static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();
//        em.getTransaction().begin();
//        Person p1 =new Person("Jay", LocalDate.of(2012,10,22));
//        Dl odl=new Dl(LocalDate.of(2052,10,10),LocalDate.of(2032,10,12),"LMV,HMV");
//        p1.setDl(odl);
////        em.persist(odl);
//        em.persist(p1);
//        em.getTransaction().commit();
//        System.out.println("Persion Created....");

//        Person p=em.find(Person.class, 2);
//        System.out.println(p.getName());
//        System.out.println("=====DL=====");
//        System.out.println(p.getDl());
        Person p=em.find(Person.class, 252);
        System.out.println(p.getName());
//        em.detach(p);
        System.out.println("====DL====");
        System.out.println(p.getDl());
        em.remove(p);
        System.out.println("p is removed");
        em.getTransaction().commit();
    }
}
