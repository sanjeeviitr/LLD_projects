package Projects.BookMyShow;

import java.util.List;
import java.util.UUID;

public class TicketService {

    public Ticket generateTicket(Booking booking){

        User user = booking.getUser();
        Show show = booking.getShow();
        List<Seat> seatList = booking.getSeatList();
        String ticketId = UUID.randomUUID().toString();
        return new Ticket(ticketId, user, show, seatList);
    }
}

/*
 generateTicket(Booking booking) : Ticket
 */