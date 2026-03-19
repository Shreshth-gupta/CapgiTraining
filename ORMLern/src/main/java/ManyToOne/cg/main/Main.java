package cg.main;

import entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(102,"iphone 18", 155000, 5, LocalDate.of(2025,11,6));
        Product p2=new Product(103,"iphone 8", 5000, 5, LocalDate.of(2025,11,6));
        Product p3=new Product(104,"iphone 1", 150, 5, LocalDate.of(2025,11,6));
        Product p4=new Product(105,"iphone 19", 15000, 5, LocalDate.of(2025,11,6));
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
//        EntityTransaction tx=em.getTransaction();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.getTransaction().commit();
        System.out.println("Product Createed.....");
    }
}
