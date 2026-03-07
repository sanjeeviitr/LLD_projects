package Projects.BookMyShow;

public class Main {

    public static void main(String[] args) {

    }
}

/*

BookMyshow -

//
//requirements -
//
//1. We are developing for one city
//2. In one city - there will be many theaters
//3. In each theatre, there will be many movies.
//4. For each movie in a single theatre, there can be mutliple show time (morning, afternoon, evening, night)
//5. A single user can book multiple seats for a show
//
//
//
//End to end flow ->
//
//User will select the city -> select the movie -> it will show all the theatres (with their show times)
//=> 5 theatres => 1 -> 4shows, 2 -> 3 shows, 3-> 2 shows .. etc
//
//Now user will select one show among the shown theatres,
//user will now select the seats (which are available)
//
//
//
//only available seats should be shown
//
//if a seat is already in booking process, that should not be available
//and two or more users try to book a single seat, we need to handle concurrency at this point -> locking the seat for first thread.



functional requirements -

1. User can browse movies in a city
2. user can see theatres and show timings for a movie
3. User can see seat availability for a show
4. user can book multiple seats for a movie show
5. user should be able to confirm booking by doing payment
6. system should generate ticket for user.
7. User can cancel their tickets.
8. When user selects seats, those seats should be temporarily locked to avoid double booking (let's say 5 mins) while users completes payment


non-functional

1. System should provide very low latency during seat booking
2. system should be available for booking during peak  hours as well .
3. System should handle high concurrency during seat booking



1.

City
User
Movie
Theater
Screen
Show
Seat
Ticket
Payment
Booking


City
name;
cityId;
List<Theater> theaters;

Theater
theaterId;
theaterName;
theaterAddress,
List<Screen> screens

Screen
screenId
List<Show> shows
List<Seat> seats

Show
showId
movieId
screenId
startTime
endTime
Map<seatId, seatStatus> seatStatusMap


Seat
seatId
seatNo
price
seatType


User
userName;
userId;
userEmail;
userPhoneNo;


Movie
movieId
movieName


Ticket
ticketId;
user;
List<Seat> seats;
show;


Payment
paymentId
paymentStatus (ENUM)
amount
paymentMethod


Booking
bookingId;
bookingStatus (ENUM)
user;
show;
List<Seat>
paymentId;



Design classes

8. When user selects seats, those seats should be temporarily locked to avoid double booking (let's say 5 mins) while users completes payment

 BookingController

 showAvailableMovies(City city) -> List<Movie> SearchService
 showAvailableShows(Movie movie) -> List<Show>- MovieService
 showAvailableSeats(Show show) -> List<Seat> - ShowService

 doBooking(Show show,User user,  List<Seat> seats) : Booking - BookingService
 cancelBooking(Booking booking) : boolean - BookingService
 doPayment(Booking booking) : boolean - PaymentService
 generateTicket(Booking booking) : Ticket - TicketService
 lockSeats(Show show, List<Seat> seats) : boolean - BookingService










 */
