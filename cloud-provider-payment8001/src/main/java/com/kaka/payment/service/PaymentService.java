package com.kaka.payment.service;

import com.kaka.commons.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by kaonglu
 * 2020/6/18
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);


}
