package com.github.springbootdemotest.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/demo")
    public String test() {
        System.out.println(123);
        return "hello world";
    }

}
