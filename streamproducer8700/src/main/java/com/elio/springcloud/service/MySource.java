package com.elio.springcloud.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.annotation.Router;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface MySource {

    @Output("myOutput")
    MessageChannel myOutput();

}
