package com.elio.springcloud.controller;

import dto.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ProductConsumerController {

    @Resource
    private RestTemplate restTemplate;

    //public static String url = "http://localhost:8100/";
    public static String url = "http://springcloud-product-provider/";

    @GetMapping("product/consumer/get/test")
    public void test(){
        System.out.println("米亚");
    }
    /**
     * 查询
     * @return
     */
    @GetMapping("product/consumer/get/info")
    public Result selectById(){
       // return new Result(200,"query success",Object.class);
       return new Result(200, "查询成功",restTemplate.getForObject(url+"product/provider/get/info", Result.class));
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/consumer/get/{id}")
    public Result selectById(@PathVariable("id") Long id){

        return new Result(200, "查询成功",
                restTemplate.getForObject(url+"product/provider/get/"+id, Result.class));
    }

}