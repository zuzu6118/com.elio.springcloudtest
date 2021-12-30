package com.elio.springcloud.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding({MySink.class})
public class ReceiveService {

    @StreamListener("myInput")
    public void receive(Object payload)
    {
        System.out.println(payload);
    }
}
