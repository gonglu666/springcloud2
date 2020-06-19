package com.kaka.clolud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by kaonglu
 * 2020/6/18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain80.class,args);
    }
}
