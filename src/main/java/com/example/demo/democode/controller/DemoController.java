package com.example.demo.democode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhenjiang
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "Welcome, my buddy!";
    }
}
