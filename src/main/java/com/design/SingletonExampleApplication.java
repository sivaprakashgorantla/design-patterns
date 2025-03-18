package com.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.design")
public class SingletonExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SingletonExampleApplication.class, args);
    }
}
