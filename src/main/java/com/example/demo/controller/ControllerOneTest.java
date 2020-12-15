package com.example.demo.controller;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ControllerOneTest {
    private static final long DEALY = 3000;
    private static final long PERIOD = 5000;
    public static void main(String[] args) {
        Date date = new Date();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("当前时间为:" +date);
            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(timerTask, DEALY, PERIOD, TimeUnit.MICROSECONDS);
    }
}
