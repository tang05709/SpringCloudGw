package com.don.tcloudgw.providerpayment.service;

import com.don.tcloudgw.providerpayment.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Integer id);
}
