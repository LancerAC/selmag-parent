package com.example.managerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class ManagerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerAppApplication.class, args);
    }

}
