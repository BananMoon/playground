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

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AsyncTaskTest {
    @Autowired
    private AsyncTask asyncTask;

    @Test
    void asyncCaller() {
        asyncTask.asyncCaller();
    }

    @Test
    void syncCaller() {
        asyncTask.syncCaller();
    }
}
