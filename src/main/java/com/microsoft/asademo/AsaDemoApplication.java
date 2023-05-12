package com.microsoft.asademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AsaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsaDemoApplication.class, args);
    }

}
