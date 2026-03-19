import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    public double averageSalary() {
        double total_sal = EmployeeRepository.getEmployees().stream().mapToDouble(Employee::getSalary).sum();
        double total_employee = EmployeeRepository.getEmployees().stream().mapToDouble(Employee::getSalary).count();
        return total_sal / total_employee;
    }

    public Map<String, Optional<Employee>> getMaxSalaryByDepartment() {
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(),
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
    }

    public Map<Department, Double> EachDepartmentTotalSalary() {
        return EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
    }

    public void DisplayEmployeeAndSalary() {
        EmployeeRepository.getEmployees().stream().forEach(e -> {
            System.out.println(e.getFirstName()+" "+e.getLastName() + " -> " + e.getSalary());
        });
    }

    public void sortBySalaryDescending() {
        EmployeeRepository.getEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(
                e->{
                    System.out.println(e.getFirstName()+" "+e.getLastName() + " -> " + e.getSalary());
                }
        );
    }


}