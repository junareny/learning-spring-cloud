package com.rxs.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class RecieveService {

    @StreamListener(Sink.INPUT)
    public void recieve(Object payload){
        System.out.println(payload);
    }

}