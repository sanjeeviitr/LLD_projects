package Projects.BookMyShow;

import java.util.List;
import java.util.UUID;

public class Booking {

    private String bookingId;
    private User user;
    private Show show;
    private List<Seat> seatList;
    private BookingStatus status;

    public Booking(User user, Show show, List<Seat> seatList) {
        this.bookingId = UUID.randomUUID().toString();
        this.user = user;
        this.show = show;
        this.seatList = seatList;
        this.status = BookingStatus.IN_PROGRESS;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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
Booking
bookingId;
bookingStatus (ENUM)
user;
show;
List<Seat>
paymentId;
 */
