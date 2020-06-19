package com.kaka.order.controller;


import com.kaka.commons.entities.CommonResult;
import com.kaka.commons.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kaonglu
 * 2020/6/18
 */
@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    private static final String url = "http://CLOUD-PAYMENT-SERVICE/payment";

    @GetMapping("consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        ResponseEntity<CommonResult> result = null;
        try {
            result  = restTemplate.postForEntity(url + "/create", payment, CommonResult.class);
        } catch (RestClientException e) {
            e.printStackTrace();
            return CommonResult.nullResult(500,"insert failed");
        }
        if (result != null){
            return result.getBody();
        }
        return CommonResult.nullResult(500,"insert failed");
    }

    @GetMapping("consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> result = null;
        try {
            result  = restTemplate.getForEntity(url + "/get/"+id, CommonResult.class);
        } catch (RestClientException e) {
            e.printStackTrace();
            return CommonResult.nullResult(500,"insert failed");
        }
        if (result != null){
            return result.getBody();
        }
        return CommonResult.nullResult(500,"insert failed");
    }

}
