package com.rxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GetwayEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayEurekaApplication.class, args);
    }
}
