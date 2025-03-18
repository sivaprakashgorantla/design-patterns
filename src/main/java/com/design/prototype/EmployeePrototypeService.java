package com.design.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class EmployeePrototypeService {

    @Autowired
    private ApplicationContext context; // To get prototype beans

    public Employee createEmployee(String name, String department) {
        Employee employee = context.getBean(Employee.class); // Get new prototype bean
        employee.setName(name);
        employee.setDepartment(department);
        return employee;
    }

    public Employee cloneEmployee(Employee existingEmployee) {

        return existingEmployee.clone();
    }
}
