package Projects.BookMyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShowService {

    public List<Seat> showAvailableSeats(Show show){
        List<Seat> seats= new ArrayList<>();
        Map<Seat, SeatStatus> seatSeatStatusMap = show.getSeatStatusMap();
        for(Map.Entry<Seat, SeatStatus> entry : seatSeatStatusMap.entrySet()){
            Seat seat = entry.getKey();
            SeatStatus seatStatus = entry.getValue();
            if(seatStatus.equals(SeatStatus.AVAILABLE)){
                seats.add(seat);
            }
        }
        return seats;
    }
}

/*
showAvailableSeats(Show show) -> List<Seat> - ShowService
 */
