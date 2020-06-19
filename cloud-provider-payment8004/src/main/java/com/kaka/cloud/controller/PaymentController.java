package com.kaka.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by kaonglu
 * 2020/6/19
 */
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/paymentzk")
    public String test(){
        return "zookeeper: "+serverPort+ UUID.randomUUID().toString();
    }
}
