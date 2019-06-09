package com.github.springbootdemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoTestApplication {

    public static void main(String[] args) {
        System.out.println(123);
        SpringApplication.run(SpringbootDemoTestApplication.class, args);
    }

}
