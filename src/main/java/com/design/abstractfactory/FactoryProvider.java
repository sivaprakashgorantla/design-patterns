package com.design.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory<?> getFactory(String choice) {
        if ("Employee".equalsIgnoreCase(choice)) {
            return new EmployeeFactory();
        } else if ("Department".equalsIgnoreCase(choice)) {
            return new DepartmentFactory();
        }
        return null;
    }
}
