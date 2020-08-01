package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    //创建map
    static Map<Long, User> userMap = new HashMap<>();
    //创建线程安全的map
//    static Map<Long, User> userMap = Collections.synchronizedMap(new HashMap<Long, User>());



}
