package com.elio.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

@EnableBinding({MySource.class})
public class SendService {

    @Resource
    private MySource mySource ;

    public void sendMsg(String msg)
    {
        mySource.myOutput().send(MessageBuilder.withPayload(msg).build());
    }

}
