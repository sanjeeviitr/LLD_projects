package org.example.BookMyShow;

import org.example.BookMyShow.enums.ShowSeatStatus;

import java.util.ArrayList;
import java.util.List;

public class SeatManagementService {

    private final List<ShowSeat> seats;

    public SeatManagementService(List<ShowSeat> seats){
        this.seats = seats;
    }
//    public List<ShowSeat> showAvailableSeats(Show show){
//        List<ShowSeat> availableSeats = new ArrayList<>();
//        for(ShowSeat showSeat : seats){
//            if(showSeat.getStatus().equals(ShowSeatStatus.AVAILABLE)){
//                availableSeats.add(showSeat);
//            }
//        }
//        return availableSeats;
//    }

    private void lockSeats(List<ShowSeat> seats, User user){
        for(ShowSeat seat : seats){
            seat.setStatus(ShowSeatStatus.LOCKED);
        }
    }

    private void releaseSeats(List<ShowSeat> seats){
        for(ShowSeat seat : seats){
            seat.setStatus(ShowSeatStatus.AVAILABLE);
        }
    }

    public void bookSeats(List<ShowSeat> seats, User user){
        lockSeats(seats, user);
        for(ShowSeat seat : seats){
            seat.setStatus(ShowSeatStatus.BOOKED);
        }
    }

    public void unBookSeats(List<ShowSeat> seats){
        releaseSeats(seats);
        for(ShowSeat seat : seats){
            seat.setStatus(ShowSeatStatus.AVAILABLE);
        }
    }

}
