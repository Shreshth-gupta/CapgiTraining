package OnetoManye.Practice;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deptId;
    private String name;
    @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
    private List<employee> emp;

    public department(String name) {
        this.name = name;
    }

    public department(String name, List<employee> emp) {
        this.name = name;
        this.emp = emp;
    }

    public department() {
    }

    public String getName() {
        return name;
    }

    public List<employee> getEmp() {
        return emp;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmp(List<employee> emp) {
        this.emp = emp;
    }
}
