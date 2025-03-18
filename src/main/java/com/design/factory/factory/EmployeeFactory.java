package com.design.factory.factory;

import com.design.factory.model.Developer;
import com.design.factory.model.Employee;
import com.design.factory.model.Manager;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        if ("Developer".equalsIgnoreCase(type)) {
            System.out.println("Developer factory.........");
            return new Developer();
        } else if ("Manager".equalsIgnoreCase(type)) {
            System.out.println("Manager factory.........");
            return new Manager();
        }
        throw new IllegalArgumentException("Invalid Employee Type");
    }
}
