package com.iiddd.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.iiddd")
public class SpringBootWaterApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWaterApp.class, args);
    }
}