package com.elio.springcloud.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    @Input("myInput")
    SubscribableChannel myInput();
}
