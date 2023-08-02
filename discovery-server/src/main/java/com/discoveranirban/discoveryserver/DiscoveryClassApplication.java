package com.discoveranirban.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryClassApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryClassApplication.class, args);
    }
}
