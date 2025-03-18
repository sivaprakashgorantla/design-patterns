package com.design.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
