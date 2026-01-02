package org.example.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private String screenId;

    public List<Seat> getSeats() {
        return seats;
    }

    private List<Seat> seats;

    public Screen(String id){
        this.screenId = id;
        this.seats = new ArrayList<>();
    }

    public void addSeats(Seat seat){
        this.seats.add(seat);
    }
}
