package com.elio.springcloud;

import com.elio.springcloud.message.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamConsumer8800 {

    public static void main(String[] args){
        SpringApplication.run(StreamConsumer8800.class, args);
    }

}