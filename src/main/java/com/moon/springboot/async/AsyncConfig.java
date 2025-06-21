/*
 * Copyright (c)
 *  AsyncConfig
 *  creation : 2025-06-21
 *  author : Yoonji Moon
 */

package com.moon.springboot.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@Configuration
public class AsyncConfig {
    /*
    비동기 작업들 실행 시 사용될 Thread Pool
    모두 Default 값으로 설정
     */
    @Bean
    public Executor asyncThreadPoolExecutor() {
        ThreadPoolTaskExecutor executer = new ThreadPoolTaskExecutor();
        executer.setCorePoolSize(1);
        executer.setMaxPoolSize(Integer.MAX_VALUE);
        executer.setQueueCapacity(Integer.MAX_VALUE);
        executer.setThreadNamePrefix("AsyncThread-");
        executer.initialize();
        return executer;
    }
}
