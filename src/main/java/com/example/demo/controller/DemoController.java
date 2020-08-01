package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
