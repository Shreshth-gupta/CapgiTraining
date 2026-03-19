import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        System.out.println(service.averageSalary());

        System.out.println(service.getMaxSalaryByDepartment());

        System.out.println(service.EachDepartmentTotalSalary());

        service.DisplayEmployeeAndSalary();

        service.sortBySalaryDescending();
    }
}