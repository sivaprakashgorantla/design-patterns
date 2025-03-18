package com.design.factory.model;

public class Developer implements Employee {
    @Override
    public String getRole() {
        return "Software Developer";
    }
}
