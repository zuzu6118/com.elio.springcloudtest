package com.elio.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.elio.springcloud.controller","com.elio.springcloud.service","com.elio.springcloud"})
@MapperScan({"com.elio.springcloud.dao"})
@EnableDiscoveryClient
public class ProductProvider8100 {

    public static void main(String[] args){
        SpringApplication.run(ProductProvider8100.class, args);
    }
}
