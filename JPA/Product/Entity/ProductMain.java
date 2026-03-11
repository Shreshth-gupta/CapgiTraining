package jPA.Product.Entity;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

import jakarta.persistence.*;

public class ProductMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin();
//        TypedQuery<ProductDto> q = em.createQuery("select new ProductDto(p.name, p.price, p.mfd) from Product p", ProductDto.class);
//        List<ProductDto> li = q.getResultList();
//        li.forEach(p -> System.out.println(p));
////        to find product with 500 price
//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price>500", Product.class);
//        List<Product> li = q.getResultList();
//        li.forEach(p -> System.out.println(p));
////          Second way by passing parameter like we did in sql with ?
//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price>:t", Product.class);
//        q.setParameter("t",499);
//        List<Product> li = q.getResultList();
//        li.forEach(p -> System.out.println(p));
//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.name LIKE :t", Product.class);
//        q.setParameter("t","%a%");
//        List<Product> li = q.getResultList();
//        li.forEach(p -> System.out.println(p));
//        TypedQuery<Product> q = em.createQuery(
//                "select new jPA.Product.Entity.Product(p.name,p.qty,p.price) from Product p",
//                Product.class
//        );        List<Product> li = q.getResultList();
//        li.forEach(p -> System.out.println(p));
        em.getTransaction().begin();
//        Query q=em.createQuery("update Product p set p.price=560 where p.pid=101");
//        int row=q.executeUpdate();
//        em.getTransaction().commit();
        Query q = em.createNativeQuery("update product_table p set p.price=530 where p.pid=101");
        int row=q.executeUpdate();
        System.out.println("Updated-> "+ row);
        em.getTransaction().commit();
    }
}