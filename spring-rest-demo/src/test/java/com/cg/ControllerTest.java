package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = EmployeeController.class)
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private IEmployeeService service;

    @Test
    void TestgetEmployeeById() throws Exception {
        EmployeeDTO edto = new EmployeeDTO("Tara", LocalDate.of(2002, 10, 11), 65461.00);
        when(service.getEmployee(1)).thenReturn(edto);
        mockMvc.perform(get("/api/employee/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName")
                        .value("Tara"));
    }
    @Test
    void getAllEmployeeTest() throws Exception{
        EmployeeDTO e1 = new EmployeeDTO("Samar", LocalDate.of(2002, 07, 13), 85000.00);
        EmployeeDTO e2 = new EmployeeDTO("Shreshtha", LocalDate.of(2003, 10, 14), 55000.00);
        EmployeeDTO e3 = new EmployeeDTO("Aarush", LocalDate.of(2004, 11, 15), 45000.00);

        when(service.getAllEmployee()).thenReturn(List.of(e1,e2,e3));

        mockMvc.perform(get("/api/employee"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.[1].fullName").value("Shreshtha"));
    }
    @Test
    void testCreateEmployee() throws Exception {
        EmployeeDTO e2 = new EmployeeDTO("Shreshtha", LocalDate.of(2003, 10, 14), 55000.00);
        when(service.createEmployee(Mockito.any(EmployeeDTO.class))).thenReturn(e2);
        mockMvc.perform(post("/api/employee").contentType("application/json").content("""
                    {
                    "fullName":"Shreshtha",
                     "dateOfBirth":"2003-10-12",
                      "salary":55000.00
                }
                """)).andExpect(status().isCreated())
                    .andExpect(jsonPath("$.fullName").value("Shreshtha"))
                    .andExpect(jsonPath("$.salary").value(55000.00));
    }
    @Test
    void testUpdateEmployee() throws Exception {
        Employee e1 = new Employee("Shreshtha", LocalDate.of(2003, 10, 14), 55100.00);
        e1.setEmpid(101);
        when(service.updateEmployee(Mockito.any(Employee.class))).thenReturn(e1);
        mockMvc.perform(put("/api/employee").contentType("application/json").content("""
                    {
                    "empid":101,
                    "name":"Shreshtha",
                    "dob":"2003-10-12",
                    "salary":55100
                    }
                """)).andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Shreshtha"))
                .andExpect(jsonPath("$.salary").value(55100.00));
    }
    @Test
    void testDeleteEmployee() throws Exception {
        Employee e1 = new Employee("Shreshtha", LocalDate.of(2003, 10, 14), 55100.00);
        e1.setEmpid(101);
        when(service.removeEmployee(101)).thenReturn("Employee Deleted");
        mockMvc.perform(delete("/api/employee/101"))
                .andExpect(status().isOk())
                .andExpect(content().string("Employee Deleted"));
    }
}
