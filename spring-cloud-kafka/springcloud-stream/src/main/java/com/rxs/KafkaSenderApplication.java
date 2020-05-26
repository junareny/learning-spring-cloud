package com.rxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class KafkaSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaSenderApplication.class, args);
    }
}
