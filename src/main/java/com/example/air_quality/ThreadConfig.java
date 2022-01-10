package com.example.air_quality;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

@Configuration
public class ThreadConfig {

    @Bean("SimpleAsync")
    public TaskExecutor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
}