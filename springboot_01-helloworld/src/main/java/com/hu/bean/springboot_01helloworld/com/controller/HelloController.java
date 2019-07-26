package com.hu.bean.springboot_01helloworld.com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }

}
