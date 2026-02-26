package CaseStudy;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
//    Find out the sum of salary of all employees.
    public double sumOfSalaries(){
        return EmployeeRepository.getEmployees()
                .stream()
                .map(e -> e.getSalary())
                .mapToDouble(e -> e)
                .sum();
    }
//    List out department names and count of employees in each department.
    public Map<String, Long> getEmployeeCountByDept() {

        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).map(e -> e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
//    Find out the senior most employee of an organization.
    public Employee getSeniorMostEmployee() {
        return EmployeeRepository.getEmployees()
                .stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
                .orElse(null);
    }
//    List employee name and duration of their service in months and days.
    public Map<String, Map<String, String>> getServiceOfEmplyee(){
        return EmployeeRepository.getEmployees().stream().collect(Collectors.toMap(
                e->e.getFirstName(),
                (e)->{
                LocalDate currentDate= LocalDate.now();
                LocalDate hireDate=e.getHireDate();
                Period p=Period.between(hireDate,currentDate);
                int totalMonth=p.getYears()*12+p.getMonths();
                return Collections.singletonMap(e.getFirstName(),"total months "+totalMonth+" Days "+p.getDays());
                }
        ));
    }
//    Find out employees without department.
    public List<Employee> getEmployeeWithNoDept(){
        return EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()==null).collect(Collectors.toList());
    }
//    Find out department without employees.
    public List<Department> getDeptWithNoEmployee(){
        List<Integer> deptIds=EmployeeRepository.getEmployees()
                .stream()
                .filter(e->e.getDepartment()!=null)
                .map(e->e.getDepartment().getDepartmentId())
                .toList();
        return EmployeeRepository.getDepartments().stream().filter(d->!deptIds.contains(d.getDepartmentId())).collect(Collectors.toList());
    }
//    Find departments with the highest count of employees.
    public String getDeptWithMostEmployee(){
        return EmployeeRepository.getEmployees()
                .stream()
                .filter(e->e.getDepartment()!=null)
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(e -> e.getKey().getDepartmentName())
                .orElse(null);
    }
}
