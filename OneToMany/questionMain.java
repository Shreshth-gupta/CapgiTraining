package OnetoManye;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class questionMain {
    static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        Question q=new Question("What is Java","M");
//        List<Answer> li=new ArrayList<>();
//        li.add(new Answer("java is oops"));
//        li.add(new Answer("java is me"));
//        li.add(new Answer("java is You"));
//        li.add(new Answer("java is Hello"));
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Table Have been created...");

//        Question q=em.find(Question.class,152);
//        System.out.println(q.getQuestionName());

//        Answer ans=em.find(Answer.class,53);
//        System.out.println("====Answer======");
//        System.out.println(ans.getAnswer());
//        System.out.println("====Question======");
//        System.out.println(ans.getQuestion().getQuestionName());


    }
}
