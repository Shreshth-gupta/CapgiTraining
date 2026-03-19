package com.cg.Controller;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getEmployee(){
        return service.getAllEmployee();
    }
    @GetMapping("/{eid}")
    public Employee getEmployeeid(@PathVariable int eid){
        return service.getEmployeeid(eid);
    }

    @GetMapping("/name/{name}")
    public List<Employee> getEmpByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @DeleteMapping("/{empid}")
    public String removeEmp(@PathVariable int empid){
        return service.removeEmployee(empid);
    }
    @PostMapping
    public Employee createNewEmployee(@RequestBody Employee emp){
        return service.creteEmployee(emp);
    }
    @PutMapping
    public  Employee updateEmployee(@RequestBody Employee emp){
            return service.updateEmployee(emp);
    }
}
