package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String hello(){
        return "This is the first line";
    }
    @GetMapping("/me")
    public String name(){
        return "Hello Rajat!!";
    }
}
