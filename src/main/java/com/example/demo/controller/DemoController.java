package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //简单理解为路由
    @RequestMapping("/")
    public String index() {
        return "Hello first Spring-boot application!";
    }

}
