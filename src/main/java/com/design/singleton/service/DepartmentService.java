package com.design.singleton.service;

import com.design.singleton.model.Department;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service // Ensures Singleton Scope by Default in Spring
public class DepartmentService {
    private final Map<Long, Department> departments = new HashMap<>();

    // Constructor - Initializes Departments
    public DepartmentService() {
        departments.put(1L, new Department(1L, "HR"));
        departments.put(2L, new Department(2L, "Engineering"));
        departments.put(3L, new Department(3L, "Sales"));
    }

    // Get Department by ID
    public Department getDepartment(Long id) {
        return departments.getOrDefault(id, new Department(0L, "Unknown"));
    }
}
