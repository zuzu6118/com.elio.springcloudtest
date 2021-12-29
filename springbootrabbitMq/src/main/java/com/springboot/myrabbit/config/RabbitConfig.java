package com.springboot.myrabbit.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String ITEM_TOPIC_EXCHANGE = "item_topic_exchange";

    public static final String ITEM_QUEUE = "item_queue";

    @Bean("itemTopicExchange")
    public Exchange topicExchange()
    {
         return ExchangeBuilder.topicExchange(ITEM_TOPIC_EXCHANGE).durable(true).build();
    }

    @Bean("itemQueue")
    public Queue itemQueue()
    {
        return QueueBuilder.durable(ITEM_QUEUE).build();
    }

    @Bean
    public Binding itemQueueExahnge(
            @Qualifier("itemQueue") Queue queue ,
            @Qualifier("itemTopicExchange") Exchange exchange

    ){
               return BindingBuilder.bind(queue).to(exchange).with("item.#").noargs();
    }

}
