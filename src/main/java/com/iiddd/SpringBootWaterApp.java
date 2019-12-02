package com.iiddd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootWaterApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWaterApp.class, args);
    }
}