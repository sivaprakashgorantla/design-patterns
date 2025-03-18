package com.design.abstractfactory;


public class ITDepartment implements Department {
    @Override
    public String getDepartmentName() {
        return "IT Department - Handles technical tasks";
    }
}
