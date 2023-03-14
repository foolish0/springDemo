package com.example.demo.democode.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async("customThreadPool")
    public void send() throws InterruptedException {
        System.out.println("start sending...");
        Thread.sleep(5000);
        System.out.println("end sending...");
    }
}
