package OnetoManye.Practice;

import jakarta.persistence.*;

//@Entity
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int empId;
    private String name;
    private int sal;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private department dept;

    public employee() {
    }

    public employee(String name, int sal, department dept) {
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    public employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public department getDept() {
        return dept;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", dept=" + dept +
                '}';
    }
}
