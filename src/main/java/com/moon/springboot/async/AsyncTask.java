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

/**
 * @Async 애노테이션은 public 메서드에만 적용 가능하다.
 * 동일 클래스 내부에서 this를 통해 호출하면 프록시 객체를 거치지 않고 직접 호출하기 때문에, 비동기 처리가 되지 않는다.
 * @Async 애노테이션은 AOP 기반의 프록시 패턴을 사용하여 동작하기 때문이다. 스프링에 의해 프록시 객체로 생성된다.
 * @EnableAsync 애노테이션을 사용하여 비동기 기능을 활성화해야한다. 이 애노테이션은 Config 클래스에 적용해야 한다. AsyncConfig 클래스 확인.
 */
@Slf4j
@Component
public class AsyncTask {

    @Async("asyncThreadPoolExecutor")
    public void async() {
        for (int i=0; i<10; i++) {
            log.info("async() - {}", i);
        }
        log.info("2. async() Method Finished. (time: {})", LocalTime.now());
    }

    public void sync() {
        for (int i=0; i<10; i++) {
            log.info("sync() - {}", i);
        }
        log.info("2. sync() Method Finished. (time: {})", LocalTime.now());
    }

}
