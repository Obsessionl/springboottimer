package com.example.demo.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AsyncTask {
    @Scheduled(cron = "0/1 * * * * *")
    public void sync() {
        sleep();
        System.out.println(Thread.currentThread().getName() +"sync，当前时间为：" + LocalDateTime.now());
    }
    @Async
    @Scheduled(cron = "0/1 * * * * *")
    public void async() {
        sleep();
        System.out.println(Thread.currentThread().getName() +"async，当前时间为：" +LocalDateTime.now());
    }
    private void sleep() {
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
