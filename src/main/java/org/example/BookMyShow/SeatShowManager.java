package org.example.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatShowManager {

    private Map<Show, List<ShowSeat>> seats;

    public SeatShowManager(){
        this.seats = new HashMap<>();
    }

    public void addShow(Show show){
        Screen screen1 = show.getScreen();
        List<Seat> seats1 = screen1.getSeats();
        List<ShowSeat> seats2 = new ArrayList<>();
        for(Seat seat : seats1){
            ShowSeat showSeat = new ShowSeat(seat, show, 200);
            seats2.add(showSeat);
        }
        this.seats.put(show, seats2);
    }

    public List<ShowSeat> getSeats(Show show){
        return seats.get(show);
    }

}
