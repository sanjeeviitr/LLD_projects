package org.example.BookMyShow;

import org.example.BookMyShow.enums.BookingStatus;
import org.example.BookMyShow.enums.PaymentStatus;

import java.util.List;

public class BookingService {

    private SeatManagementService seatManagementService;
    private PaymentService paymentService;

    public BookingService(SeatManagementService seatManagementService,
                          PaymentService paymentService) {
        this.seatManagementService = seatManagementService;
        this.paymentService = paymentService;
    }

    public BookingStatus createBooking(User user, Show show, List<ShowSeat> seats){
        seatManagementService.bookSeats(seats, user);
        Booking booking = new Booking(show, seats, user);
        PaymentStatus status =  paymentService.makePayment(booking, 1000);
        return booking.getStatus();
    }

    public BookingStatus confirmBooking(Booking booking){
        return BookingStatus.CONFIRMED;
    }

    public BookingStatus cancelBooking(Booking booking){
        return BookingStatus.CANCELLED;
    }
}
