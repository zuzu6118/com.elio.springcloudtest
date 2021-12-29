package com.springboot.consume.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @RabbitListener(queues = "item_queue")
    public void msg(String msg)
    {
        System.out.println("消费者消费消息了："+msg);
    }

}
