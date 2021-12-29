package com.elio.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = {"com.elio.springcloud.controller","com.elio.springcloud.service","com.elio.springcloud"})
@MapperScan({"com.elio.springcloud.dao"})
@EnableDiscoveryClient
@EnableHystrix
public class ProductProvider8100 {

    public static void main(String[] args){
        SpringApplication.run(ProductProvider8100.class, args);
    }

   // @Bean
    public ServletRegistrationBean getServlet()
    {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsServlet");
        return registrationBean ;
    }

}
