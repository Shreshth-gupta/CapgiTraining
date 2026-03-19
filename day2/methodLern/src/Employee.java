public class Employee {
    private int empid;
    private String name;
    private double salary;

    public Employee(int empid, String name, double salary) {
        setEmpid(empid);
        setName(name);
        setSalary(salary);
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return this.getName();
    }
}