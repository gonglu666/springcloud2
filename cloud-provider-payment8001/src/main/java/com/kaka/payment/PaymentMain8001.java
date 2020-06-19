package com.kaka.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by kaonglu
 * 2020/6/18
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient 其他的注册中心可以使用这个注解
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
