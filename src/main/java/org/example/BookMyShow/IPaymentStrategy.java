package org.example.BookMyShow;

import org.example.BookMyShow.enums.PaymentStatus;

public interface IPaymentStrategy {

    PaymentStatus pay(double amount);
}
