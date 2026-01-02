package org.example.BookMyShow;

import org.example.BookMyShow.enums.PaymentStatus;

public class UPI implements IPaymentStrategy{
    @Override
    public PaymentStatus pay(double amount) {
        return PaymentStatus.SUCCESS;
    }
}
