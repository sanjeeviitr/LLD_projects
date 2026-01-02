package org.example.BookMyShow;

import org.example.BookMyShow.enums.PaymentStatus;

public class PaymentService {

    private IPaymentStrategy strategy;

    public PaymentService(){
        this.strategy = new UPI();
    }
    public PaymentStatus makePayment(Booking booking , int price){
        return this.strategy.pay(price);
    }
}
