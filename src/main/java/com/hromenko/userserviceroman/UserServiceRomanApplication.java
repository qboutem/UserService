package com.hromenko.userserviceroman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;


@SpringBootApplication
public class UserServiceRomanApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceRomanApplication.class, args);
    }

}
