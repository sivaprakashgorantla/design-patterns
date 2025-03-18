package com.design.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // Enables Prototype Pattern
public class Employee implements Cloneable {
    private String name;
    private String department;

    public Employee() {}

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
