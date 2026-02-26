import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    ArrayList<Employee> emps = new ArrayList<>();
    public EmployeeList() {
        emps.add(new Employee(101, "Atul", 56000));
        emps.add(new Employee(2, "Saurabh", 65000));
        emps.add(new Employee(3, "Raj", 75000));
        emps.add(new Employee(4, "Sara", 85000));
        emps.add(new Employee(5, "Raj", 85000));
    }

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        employeeList.emps.stream().filter(employee->employee.getSalary()>80000).forEach(employee -> System.out.println(employee.getName()+" "+employee.getSalary()));


        List<Double> name = employeeList.emps.stream().filter(employee->employee.getName().equals("Raj")).map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(name);


        Employee max_sal_obj = employeeList.emps.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).get();
        double max_salary = employeeList.emps.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).get().getSalary();
        System.out.println(max_sal_obj+" "+max_salary);


        long startTime = System.currentTimeMillis();
        double total_salary = employeeList.emps.stream().collect(Collectors.summingDouble(Employee::getSalary));
        long endTime = System.currentTimeMillis();
        System.out.println(total_salary);
        System.out.println("Sequential Total Time-> "+(endTime-startTime));


        double avg_salary = employeeList.emps.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg_salary);


        startTime =  System.currentTimeMillis();
        total_salary = employeeList.emps.parallelStream().collect(Collectors.summingDouble(Employee::getSalary));
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Total Time-> "+(endTime-startTime));


        startTime = System.currentTimeMillis();
        total_salary = 0;
        for (Employee e: employeeList.emps){
            total_salary+=e.getSalary();
        }
        endTime = System.currentTimeMillis();
        System.out.println(total_salary);
        System.out.println("For Loop Time-> "+(endTime-startTime));

    }

}