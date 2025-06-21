/*
 * Copyright (c)
 *  AsyncTask
 *  creation : 2025-06-21
 *  author : Yoonji Moon
 */

package com.moon.springboot.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Slf4j
@Component
public class AsyncTask {

    public void asyncCaller() {
        log.info("1. Before Calling asyncCaller() Method (time: {})", LocalTime.now());
        async();
        log.info("3. syncCaller() Method Finished. (time: {})", LocalTime.now());
    }

    @Async("asyncThreadPoolExecutor")
    public void async() {
        for (int i=0; i<10000; i++) {
            System.out.println();
        }
        log.info("2. async() Method Finished. (time: {})", LocalTime.now());
    }

    public void syncCaller() {
        log.info("1. Before Calling syncCaller() Method (time: {})", LocalTime.now());
        sync();
        log.info("3. syncCaller() Method Finished. (time: {})", LocalTime.now());
    }

    public void sync() {
        for (int i=0; i<10000; i++) {
            System.out.println();
        }
        log.info("2. sync() Method Finished. (time: {})", LocalTime.now());
    }

}
