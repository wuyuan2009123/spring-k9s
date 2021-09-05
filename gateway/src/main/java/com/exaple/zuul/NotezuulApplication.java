package com.exaple.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotezuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotezuulApplication.class, args);
    }

}
