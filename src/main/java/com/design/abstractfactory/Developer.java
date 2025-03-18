package com.design.abstractfactory;

public class Developer implements Employee {
    @Override
    public String getDetails() {
        return "Developer - Writes and maintains code";
    }
}
