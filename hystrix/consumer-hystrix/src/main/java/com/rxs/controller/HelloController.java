package com.rxs.controller;

import com.rxs.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(name = "name", required = true) String name) {
        System.out.println("[ConsumerHystrixApplication] hello " + name + "！");
        return helloRemote.hello(name);
    }
}
