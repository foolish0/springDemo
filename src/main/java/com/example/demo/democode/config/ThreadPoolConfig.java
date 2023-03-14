package com.example.demo.democode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadPoolConfig {

    @Bean("customThreadPool")
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setThreadNamePrefix("Async");
        poolTaskExecutor.setCorePoolSize(1);
        poolTaskExecutor.setMaxPoolSize(3);
        poolTaskExecutor.setQueueCapacity(0);
        poolTaskExecutor.setKeepAliveSeconds(10);
        poolTaskExecutor.setRejectedExecutionHandler(new MyRejectPolicy());
        return poolTaskExecutor;
    }
}
