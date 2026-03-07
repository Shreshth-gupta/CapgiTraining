import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    private int authorId;
    private String authorName;
    private String email;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {
    }

    public Author(int authorId,String authorName, String email) {
        this.authorId=authorId;
        this.authorName = authorName;
        this.email = email;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
