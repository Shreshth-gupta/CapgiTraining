import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String title;
    private int price;
    @ManyToOne
    private Author author;

    public Book() {
    }

    public Book(String title, int price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
