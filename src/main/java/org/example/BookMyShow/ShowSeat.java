package org.example.BookMyShow;

import org.example.BookMyShow.enums.ShowSeatStatus;

public class ShowSeat {

    private Seat seat;
    private Show show;
    private ShowSeatStatus status;
    private int price;

    public ShowSeat(Seat seat, Show show,int price){
        this.seat = seat;
        this.show = show;
        this.price = price;
        this.status = ShowSeatStatus.AVAILABLE;
    }

    public ShowSeatStatus getStatus(){
        return status;
    }

    public void setStatus(ShowSeatStatus status){
        this.status = status;
    }
}
