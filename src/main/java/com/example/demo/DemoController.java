package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }    

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
