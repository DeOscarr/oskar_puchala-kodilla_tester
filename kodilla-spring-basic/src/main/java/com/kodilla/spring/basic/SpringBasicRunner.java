package com.kodilla.spring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //clean build eliminuje targety, foldery ze skompilowanymi klasami
public class SpringBasicRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicRunner.class,args);
    }
}