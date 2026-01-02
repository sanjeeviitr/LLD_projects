package org.example.BookMyShow;

import org.example.BookMyShow.enums.BookingStatus;
import org.example.BookMyShow.enums.SeatType;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Dhoom", "1", 120);
        Movie movie2 = new Movie("Dhoom2", "2", 125);
        City city1 = new City("Hyderabad", "1");
        Theatre theatre1 = new Theatre("GVK one",  city1, "Kondapur");
        Screen screen1 = new Screen("1");
        Screen screen2 = new Screen("2");
        theatre1.addScreen(screen1);
        theatre1.addScreen(screen2);
        Show show1 = new Show(movie1, screen1, LocalTime.of(12, 30));
        Show show2 = new Show(movie2, screen2, LocalTime.of(12,30));
        theatre1.addShow(show1);
        theatre1.addShow(show2);

        User user = new User("Rahul", "1", "123", "dummy");
        Seat seat1 = new Seat("1", SeatType.GOLD);
        Seat seat2 = new Seat("2", SeatType.GOLD);
        Seat seat3 = new Seat("3", SeatType.GOLD);
        screen1.addSeats(seat1);
        screen1.addSeats(seat2);
        screen1.addSeats(seat3);
        ShowSeat showSeat1 = new ShowSeat(seat1, show1, 200);
        ShowSeat showSeat2 = new ShowSeat(seat2, show1, 200);
        List<ShowSeat> bookSeatList = new ArrayList<>();
        bookSeatList.add(showSeat1);
        bookSeatList.add(showSeat2);
        SeatShowManager manager = new SeatShowManager();
        List<ShowSeat> seats = manager.getSeats(show1);
        SeatManagementService seatManagementService = new SeatManagementService(seats);
        PaymentService paymentService = new PaymentService();
        BookingService bookingService = new BookingService(seatManagementService, paymentService);
        BookingStatus status =  bookingService.createBooking(user,show1, bookSeatList);
        System.out.println("Status is : " + status);

    }
}
