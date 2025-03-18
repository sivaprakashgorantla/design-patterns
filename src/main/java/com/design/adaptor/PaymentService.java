package com.design.adaptor;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    public PaymentService() {
        this.paymentProcessor = new RazorpayAdapter(new RazorpayGateway()); // Using Adapter
    }

    public void processPayment(int amount) {
        paymentProcessor.pay(amount);
    }
}
