package com.example.javatest.payments;

public class PaymentResponse {
    enum PaymentStatus {
        OK, ERROR
    }

    public PaymentStatus status;

    public PaymentResponse(PaymentStatus paymentStatus) {
        this.status = paymentStatus;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
