package com.example.javatest.payments;

public interface PaymentGateway {
    PaymentResponse paymentRequest(PaymentRequest request);
}
