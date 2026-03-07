package Projects.BookMyShow;

import java.util.List;

public class BookingController {

    BookingService bookingService;
    SearchService searchService;
    ShowService showService;
    MovieService movieService;


    public List<Movie> findMovies(City city) {
        return searchService.showAvailableMovies(city);
    }

    public List<Show> findAvailableShows(Movie movie){
        return movieService.showAvailableShows(movie);
    }

    public List<Seat> findAvailableSeats(Show show) {
        return showService.showAvailableSeats(show);
    }

    public Booking bookSeats(User user, Show show, List<Seat> seatList) {
        return bookingService.createBooking(show, user, seatList);
    }

}

/*

 */
