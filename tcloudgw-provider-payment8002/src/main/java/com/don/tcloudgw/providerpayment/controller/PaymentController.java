package com.don.tcloudgw.providerpayment.controller;

import com.don.tcloudgw.providerpayment.entities.CommonResult;
import com.don.tcloudgw.providerpayment.entities.Payment;
import com.don.tcloudgw.providerpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "success: server port" + serverPort, result);
        }
        return new CommonResult(445, "fail", null);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id)
    {
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            return new CommonResult(445, "fail", null);
        }
        return new CommonResult(200, "cuccess: server port" + serverPort, payment);
    }

    @GetMapping("/out/{id}")
    public CommonResult<Payment> outPaymentById(@PathVariable("id") Integer id)
    {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            return new CommonResult(445, "fail", null);
        }
        return new CommonResult(200, "cuccess: server port" + serverPort, payment);
    }
}
