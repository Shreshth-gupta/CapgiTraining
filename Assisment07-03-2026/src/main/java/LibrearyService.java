import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrearyService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);

    public void CreateAuther() {
        em.getTransaction().begin();
        System.out.println("enter the Auther details Id, Name then Email");
        int id=sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String email = sc.nextLine();
        Author a = new Author(id,name, email);
        List<Book> li = new ArrayList<Book>();
        System.out.println("No. of books of Auther" + a.getAuthorName());
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("give book detail");
            String bname = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            li.add(new Book(bname, price, a));
        }
        a.setBooks(li);
        em.persist(a);
        em.getTransaction().commit();
        System.out.println("Created Author" + a.getAuthorId());
    }
    public void AllBookOfAuthor(){
        List<Author> a=em.createQuery("select e from Author e",Author.class).getResultList();
        a.forEach(a1->{
            System.out.println(a1.getAuthorId());
            System.out.println(a1.getAuthorName());
            List<Book> b=a1.getBooks();
            b.forEach(b1->{
                System.out.println(b1.getBookId()+" "+ b1.getTitle()+" "+ b1.getPrice());
            });
        });
    }
    public void UpdatePrice(){
        em.getTransaction().begin();
        System.out.println("Enter Book id");
        int id= sc.nextInt();
        sc.nextLine();
        Book b=em.find(Book.class,id);
        int newPrice=sc.nextInt();
        sc.nextLine();
        b.setPrice(newPrice);
        System.out.println("Price Updated "+ b.getTitle());
        em.getTransaction().commit();
    }
    public void DeleteAuther(int id){
        em.getTransaction().begin();
        Author a=em.find(Author.class,id);
        em.remove(a);
        em.getTransaction().commit();
    }
    public void DeleteBook(int id){
        em.getTransaction().begin();
        Book b=em.find(Book.class,id);
        em.remove(b);
        em.getTransaction().commit();
    }
}
