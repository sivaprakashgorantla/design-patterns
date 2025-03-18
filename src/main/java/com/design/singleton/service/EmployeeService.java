package com.design.singleton.service;

import com.design.singleton.model.Department;
import com.design.singleton.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final DepartmentService departmentService; // Singleton Dependency
    private final Map<Long, Employee> employees = new HashMap<>();

    // Constructor Injection of Singleton DepartmentService
    public EmployeeService(DepartmentService departmentService) {
        this.departmentService = departmentService;
        employees.put(1L, new Employee(1L, "Alice", departmentService.getDepartment(2L)));
        employees.put(2L, new Employee(2L, "Bob", departmentService.getDepartment(1L)));
    }

    // Get Employee by ID
    public Employee getEmployee(Long id) {
        return employees.getOrDefault(id, new Employee(0L, "Unknown", new Department(0L, "None")));
    }
}
