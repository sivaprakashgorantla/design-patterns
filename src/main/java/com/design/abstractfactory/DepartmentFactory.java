package com.design.abstractfactory;

public class DepartmentFactory implements AbstractFactory<Department> {
    @Override
    public Department create(String type) {
        if ("IT".equalsIgnoreCase(type)) {
            return new ITDepartment();
        } else if ("HR".equalsIgnoreCase(type)) {
            return new HRDepartment();
        }
        return null;
    }
}
