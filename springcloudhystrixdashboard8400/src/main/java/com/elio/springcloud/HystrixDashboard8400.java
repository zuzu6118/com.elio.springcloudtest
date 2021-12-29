package com.elio.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard8400 {

    public static void main(String[] args){
        SpringApplication.run(HystrixDashboard8400.class, args);
    }
}