package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

//@Component
@Slf4j
public class DemoTask {
    private static final Logger log = LoggerFactory.getLogger(DemoTask.class);
    private AtomicInteger atomicInteger = new AtomicInteger();
    @Scheduled(cron = "0/5 * * * * *")
    public void execute() {
        log.info("[定时任务第 {} 次执行]", atomicInteger.incrementAndGet());
    }
}
