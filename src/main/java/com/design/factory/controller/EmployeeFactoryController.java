package com.design.factory.controller;

import com.design.factory.model.Employee;
import com.design.factory.factory.EmployeeFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factory")
public class EmployeeFactoryController {

    @GetMapping("/{type}")
    public String getEmployeeRole(@PathVariable String type) {
        Employee employee = EmployeeFactory.getEmployee(type);
        return "Employee Role: " + employee.getRole();
    }
}
