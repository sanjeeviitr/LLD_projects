package org.example.BookMyShow;

import org.example.BookMyShow.enums.BookingStatus;

import java.util.List;
import java.util.UUID;

public class Booking {

    private Show show;
    private String bookingId;
    private List<ShowSeat> seats;
    private BookingStatus status;
    private User user;

    public Booking(Show show, List<ShowSeat> seats, User user) {
        this.show = show;
        this.seats = seats;
        this.status = BookingStatus.CREATED;
        this.user = user;
        this.bookingId = UUID.randomUUID().toString();
    }

    public BookingStatus getStatus(){
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

}
