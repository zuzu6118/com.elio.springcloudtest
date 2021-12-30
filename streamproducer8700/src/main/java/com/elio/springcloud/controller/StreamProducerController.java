package com.elio.springcloud.controller;

import com.elio.springcloud.service.SendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StreamProducerController {

   @Resource
   private SendService sendService ;

   @GetMapping(value = "/send/{msg}")
   public void send(@PathVariable(name = "msg") String msg)
   {
       sendService.sendMsg(msg);
   }

}
