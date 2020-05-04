package com.don.tcloudgw.providerpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderPayment {
    public static void main(String[] args)
    {
        SpringApplication.run(ProviderPayment.class, args);
    }
}
