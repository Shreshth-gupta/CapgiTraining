package com.cg.DTO;

import com.cg.entity.Employee;

public class EntityMapper {
    public static Employee convertDtoToEntity(EmployeeDTO edto) {
        return new Employee(edto.getName(), edto.getDob(), edto.getSalary());
    }

    public static EmployeeDTO convertEntityToDto(Employee emp) {
        return new EmployeeDTO(emp.getEmpid(), emp.getName(), emp.getDob(), emp.getSalary());
    }
}