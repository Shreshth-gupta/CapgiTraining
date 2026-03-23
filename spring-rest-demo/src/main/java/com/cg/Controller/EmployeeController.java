package com.cg.Controller;

import com.cg.DTO.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    public EmployeeController(IEmployeeService service){
        super();
        this.service=service;
    }
    @GetMapping
    public List<Employee> getEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping(value = "/{empid}", produces = "application/xml")
    public EmployeeDTO getEmployeeid(@PathVariable int eid) {
        return service.getEmployeeid(eid);
    }

    @GetMapping("/{eid}")
    public ResponseEntity<EmployeeDTO> getEmp(@PathVariable int eid) {
        EmployeeDTO e = service.getEmployeeid(eid);
        if (e != null) {
            return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
        } else {
            return new ResponseEntity<EmployeeDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/name/{name}")
    public List<EmployeeDTO> getEmpByName(@PathVariable String name) {
        return service.getEmployeeByName(name);
    }

    @DeleteMapping("/{empid}")
    public String removeEmp(@PathVariable int empid) {
        return service.removeEmployee(empid);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody Employee emp) {
        return service.creteEmployee(emp);
    }

    @PutMapping
    public EmployeeDTO updateEmployee(@RequestBody Employee emp) {
        return service.updateEmployee(emp);
    }
}
