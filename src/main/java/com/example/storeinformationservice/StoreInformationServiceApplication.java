package com.example.storeinformationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreInformationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreInformationServiceApplication.class, args);
    }

}
