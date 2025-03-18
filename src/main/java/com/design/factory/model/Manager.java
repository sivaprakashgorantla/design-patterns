package com.design.factory.model;

public class Manager implements Employee {
    @Override
    public String getRole() {
        return "Project Manager";
    }
}
