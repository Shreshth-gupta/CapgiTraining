package com.cg.controller;

import java.util.List;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;

@RestController
@RequestMapping("api/employee")
@Tag(name="EmployeeAPI",description="This is the CERUD operations Employee Entity")
public class EmployeeController {
	//@Autowired
	private IEmployeeService service;	
	
	public EmployeeController(IEmployeeService service) {
		super();
		this.service = service;
	}
	@GetMapping(produces = {"application/json","application/xml"})
	public List<EmployeeDTO> getAll() {
		return service.getAllEmployee();
	}
	@GetMapping("/{eid}")
	public ResponseEntity<EmployeeDTO> getEmp(@PathVariable int eid) {
		return new ResponseEntity<EmployeeDTO>(service.getEmployee(eid),HttpStatus.OK);
		
	}
//	@GetMapping("/{name}")
//	public List<EmployeeDTO> getEmpByName(@RequestParam(name) String name) {
//		return service.getEmployeeByName(name);
//	}
	
	@PostMapping(consumes = {"application/json","application/xml"})
	@ResponseStatus(HttpStatus.CREATED)
	public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO emp) {
		return service.createEmployee(emp);
	}
	
	@DeleteMapping("/{eid}")
	public String delEmp(@PathVariable int eid) {
		return service.removeEmployee(eid);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
}
