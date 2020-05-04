package com.don.tcloudgw.providerpayment.service.impl;

import com.don.tcloudgw.providerpayment.dao.PaymentDao;
import com.don.tcloudgw.providerpayment.entities.Payment;
import com.don.tcloudgw.providerpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
