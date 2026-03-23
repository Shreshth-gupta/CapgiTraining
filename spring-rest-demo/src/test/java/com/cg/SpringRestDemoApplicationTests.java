package com.cg;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeNotFoundException;
import com.cg.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {

    @Mock
    private IEmployeeRepo repo;

    @InjectMocks
    private EmployeeService service;

    @Test
    void testEmployeeById() {
        EmployeeDTO dto = new EmployeeDTO("Rage", LocalDate.of(2002, 10, 22), 34522.00);
        dto.setEmployeeId(1001);

        Employee emp = EntityMapper.convertObjectToEntity(dto);

        when(repo.findById(1001)).thenReturn(Optional.of(emp));

        assertNotNull(service.getEmployee(1001));
        assertEquals("Rage", service.getEmployee(1001).getFullName());
    }

    @Test
    void testEmployeeTestWithException() {
        when(repo.findById(1002)).thenReturn(Optional.empty());

        assertThrows(EmployeNotFoundException.class, () -> service.getEmployee(1002));
    }

    @Test
    void testEmployeeCreate() {
        EmployeeDTO dto = new EmployeeDTO("Raj", LocalDate.of(2002, 11, 22), 34522.00);
        dto.setEmployeeId(102);
        Employee emp = EntityMapper.convertObjectToEntity(dto);

        when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);

        EmployeeDTO result = service.createEmployee(dto);
        assertNotNull(result);
        assertEquals("Raj", result.getFullName());
    }

    @Test
    void testEmployeeRemove() {
        EmployeeDTO dto = new EmployeeDTO("Rage", LocalDate.of(2002, 10, 22), 34522.00);
        dto.setEmployeeId(1001);

        Employee emp = EntityMapper.convertObjectToEntity(dto);

        when(repo.findById(1001)).thenReturn(Optional.of(emp));
        String result = service.removeEmployee(1001);
        assertEquals("Employee Deleted", result);
    }

    @Test
    void testEmployeeUpdate() {
        EmployeeDTO dto = new EmployeeDTO("Rage", LocalDate.of(2002, 10, 22), 34522.00);
        dto.setEmployeeId(1001);

        Employee existing = EntityMapper.convertObjectToEntity(dto);
        existing.setEmpid(1001);

        when(repo.findById(1001)).thenReturn(Optional.of(existing));

        existing.setName("Manav");

        when(repo.saveAndFlush(any(Employee.class))).thenReturn(existing);

        Employee result = service.updateEmployee(existing);

        assertEquals("Manav", result.getName());
    }

    @Test
    void testEmployeeByName() {
        EmployeeDTO dto = new EmployeeDTO("Rage", LocalDate.of(2002, 10, 22), 34522.00);
        dto.setEmployeeId(1001);

        Employee emp = EntityMapper.convertObjectToEntity(dto);

        when(repo.findById(1001)).thenReturn(Optional.of(emp));

        assertNotNull(service.getEmployeeByName(emp.getName()));
        assertEquals("Rage", service.getEmployee(1001).getFullName());
    }

    @Test
    void testEmployeeByGetAll() {
        List<Employee> lemp = new ArrayList<>(List.of(new Employee("Rage", LocalDate.of(2002, 10, 22), 34522.00),
                new Employee("Raj", LocalDate.of(2002, 11, 22), 34522.00)));
        when(repo.findAll()).thenReturn(lemp);
        List<EmployeeDTO> result = service.getAllEmployee();
        assertEquals(2,result.size());
    }
}