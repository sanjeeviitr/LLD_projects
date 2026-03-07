package Projects.BookMyShow;

import java.util.List;

public class Ticket {

    private String ticketId;
    private User user;
    private Show show;
    private List<Seat> seatList;

    public Ticket(String ticketId, User user, Show show, List<Seat> seatList) {
        this.ticketId = ticketId;
        this.user = user;
        this.show = show;
        this.seatList = seatList;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}

/*
Ticket
ticketId;
user;
List<Seat> seats;
show;
 */
