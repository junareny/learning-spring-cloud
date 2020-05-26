package com.rxs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.class)
@SpringBootApplication
public class SendService {

    @Autowired
    private Source source;

    public void sendMsg(String msg){
        source.output().send(MessageBuilder.withPayload(msg).build());
    }

}