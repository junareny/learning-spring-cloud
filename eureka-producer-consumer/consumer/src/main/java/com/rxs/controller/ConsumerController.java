package com.rxs.controller;

import com.rxs.remote.RemoteHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    RemoteHello remoteHello;

    //第一种传参方式
    /*@RequestMapping("/hello")
    public String hello(@RequestParam(required = true, name = "name", defaultValue = "rxs2") String name) {
        return remoteHello.hello(name);
    }*/
    //第二种传参方式
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(name = "name", required = true) String name) {
        return remoteHello.hello(name);
    }
}
