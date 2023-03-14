package com.example.demo.democode.service.impl;

import com.example.demo.democode.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizhenjiang
 */
@Service
public class SendMessage {
    @Autowired
    private AsyncService asyncService;
    public void report() {
        // 数据库查询
        System.out.println("query db 01");
        // 异步调用方法
        try {
            asyncService.send();
        } catch (Exception e) {
            System.out.println("exception");
        }
        // 数据库查询
        System.out.println("query db 02");
    }
}
