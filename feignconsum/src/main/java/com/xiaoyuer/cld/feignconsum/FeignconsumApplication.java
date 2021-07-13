package com.xiaoyuer.cld.feignconsum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignconsumApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignconsumApplication.class, args);
    }

}
