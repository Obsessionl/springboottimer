package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling // 同步
@EnableAsync // 异步
public class SchduleConfig {

}
