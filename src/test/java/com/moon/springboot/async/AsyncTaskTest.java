/*
 * Copyright (c)
 *  AsyncTaskTest
 *  creation : 2025-06-21
 *  author : Yoonji Moon
 */

package com.moon.springboot.async;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
class AsyncTaskTest {
    @Autowired
    private AsyncTask asyncTask;

    @Test
    void async() {
        System.out.println("1. Before async() Calling : " + LocalTime.now());
        asyncTask.async();
        System.out.println("3. async() finished : " + LocalTime.now());
    }

    @Test
    void sync() {
        System.out.println("1. Before Calling : " + LocalTime.now());
        asyncTask.sync();
        System.out.println("3. sync() finished : " + LocalTime.now());
    }
}
