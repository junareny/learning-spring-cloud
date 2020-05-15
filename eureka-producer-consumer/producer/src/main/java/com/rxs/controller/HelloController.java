package com.rxs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=true, defaultValue="rxs")String name) {
        System.out.println("hello " + name +"！");
        return "[ProducerApplication]：hello " + name +"！";
    }
}
