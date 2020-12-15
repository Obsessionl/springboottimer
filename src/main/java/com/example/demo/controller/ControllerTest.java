package com.example.demo.controller;


import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 21072
 */
public class ControllerTest {
    private static final long DEALY = 3000;
    private static final long PERIOD = 5000;
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("当前时间为:" +System.currentTimeMillis());
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, DEALY, PERIOD);
    }
}
