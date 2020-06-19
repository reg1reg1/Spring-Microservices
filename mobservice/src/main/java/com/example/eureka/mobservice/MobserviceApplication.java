package com.example.eureka.mobservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobserviceApplication.class, args);
    }

}
