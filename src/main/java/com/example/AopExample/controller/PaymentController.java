package com.example.aopexample.controller;

import com.example.AopExample.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/pay")
    public String doPayment() {
        paymentService.makePayment();
        return "Payment done!";
    }

    @GetMapping("/status/{id}")
    public String status(@PathVariable String id) {
        return paymentService.getStatus(id);
    }
}
