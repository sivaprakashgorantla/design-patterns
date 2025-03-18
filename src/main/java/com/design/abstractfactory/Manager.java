package com.design.abstractfactory;

public class Manager implements Employee {
    @Override
    public String getDetails() {
        return "Manager - Handles team and projects";
    }
}