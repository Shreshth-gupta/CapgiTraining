package ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

//@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String name;
//    mapping is onlyused when we alredy have a table
    @ManyToMany
    private Set<Course> courses;

    public Student() {
    }

    public Student(String name, Set<Course> cources) {
        this.name = name;
        this.courses = cources;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }
}
