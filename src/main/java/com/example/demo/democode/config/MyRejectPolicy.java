package com.example.demo.democode.config;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author lizhenjiang
 */
public class MyRejectPolicy implements RejectedExecutionHandler {
    public MyRejectPolicy() {

    }
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Reject task");
    }
}
