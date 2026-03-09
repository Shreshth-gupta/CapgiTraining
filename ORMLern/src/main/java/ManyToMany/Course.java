package ManyToMany;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;


    @ManyToMany
    private List<Student> students;

    public Course() {
    }

    public Course(String cname, List<Student> students) {
        this.cname = cname;
        this.students = students;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
