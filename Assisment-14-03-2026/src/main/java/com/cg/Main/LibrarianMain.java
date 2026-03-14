package com.cg.Main;

import com.cg.beans.Librarian;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibrarianMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Librarian LB = (Librarian) ctx.getBean("Librarian");
        LB.issueBook();
    }
}
