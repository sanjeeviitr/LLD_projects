package org.example.BookMyShow;

import org.example.BookMyShow.enums.SeatType;

public class Seat {

    private String seatId;
    private SeatType seatType;

    public Seat(String id, SeatType type){
        this.seatId = id;
        this.seatType = type;
    }
}
