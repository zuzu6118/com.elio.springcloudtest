package com.elio.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamProducer8700 {

    public static void main(String[] args) {
        SpringApplication.run(StreamProducer8700.class);
    }
}
