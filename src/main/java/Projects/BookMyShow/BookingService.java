package Projects.BookMyShow;

import java.util.List;

public class BookingService {

    private TicketService ticketService;
    private PaymentService paymentService;

    BookingService() {
        this.paymentService = new PaymentService();
        this.ticketService = new TicketService();
    }

    public Booking createBooking(Show show, User user, List<Seat> seatList) {
        Booking booking = new Booking(user, show, seatList);
        boolean isSeatLocked = lockSeats(show, seatList);
        if (!isSeatLocked) return null;
        PaymentStatus paymentStatus = paymentService.doPayment(booking);
        if (paymentStatus.equals(PaymentStatus.SUCCESS)) {
            ticketService.generateTicket(booking);
            return booking;
        }
        return null;
    }

    public boolean cancelBooking(Booking booking) {

        // update the seats to available
        // refund

        return true;


    }

    public boolean lockSeats(Show show, List<Seat> seats) {

        synchronized (show) {
            for (Seat seat : seats) {
                if (show.getSeatStatusMap().get(seat) != (SeatStatus.AVAILABLE)) {
                    System.out.println("Seat is not available");
                    return false;
                }
            }
            for (Seat seat : seats) {
                show.getSeatStatusMap().put(seat, SeatStatus.LOCKED);
            }
        }
        return true;
    }
}

/*

 doBooking(Show show,User user,  List<Seat> seats) : Booking - BookingService
 cancelBooking(Booking booking) : boolean - BookingService
 => update  the seats to available =
  lockSeats(Show show, List<Seat> seats) : boolean
 */


