package com.example.AopExample.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void makePayment() {
        System.out.println("Payment processing started...");
        // simulate processing
        try { Thread.sleep(200); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println("Payment successful!");
    }

    public String getStatus(String txId) {
        System.out.println("Getting status for " + txId);
        return "COMPLETED";
    }
}

