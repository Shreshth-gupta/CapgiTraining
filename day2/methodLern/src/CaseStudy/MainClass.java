package CaseStudy;

public class MainClass {
    public static void main(String[] args) {
    EmployeeService es=new EmployeeService();
    Employee emp=new Employee();
        System.out.println(es.sumOfSalaries());
        System.out.println(es.getDeptWithMostEmployee());
        System.out.println(es.getServiceOfEmplyee());
        System.out.println(es.getSeniorMostEmployee());
        System.out.println(es.getEmployeeCountByDept());
        System.out.println(es.getDeptWithNoEmployee());
        System.out.println(es.getDeptWithMostEmployee());
    }
}
