package com.ren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterApplication.class, args);
//        SpringApplication springApplication = new SpringApplication(EurekaClusterApplication.class);
//        springApplication.setAdditionalProfiles("node1");
//        springApplication.run(args);
    }
}
