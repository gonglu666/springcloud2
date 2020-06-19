package com.kaka.clolud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kaonglu
 * 2020/6/19
 */
@RestController
@Slf4j
public class OrderZkController {

    @Autowired
    RestTemplate restTemplate;

    private static final String url = "http://cloud-provider-payment/";

    @GetMapping("/consumer/orderzk")
    public String testOrderConsumer(){
        String obj = restTemplate.getForObject(url + "provider/paymentzk", String.class);
        return obj;
    }


}
