package com.design.abstractfactory;

public class EmployeeFactory implements AbstractFactory<Employee> {
    @Override
    public Employee create(String type) {
        if ("Manager".equalsIgnoreCase(type)) {
            return new Manager();
        } else if ("Developer".equalsIgnoreCase(type)) {
            return new Developer();
        }
        return null;
    }
}
