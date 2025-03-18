package com.design.abstractfactory;

public class HRDepartment implements Department {
    @Override
    public String getDepartmentName() {
        return "HR Department - Manages hiring and employees";
    }
}
