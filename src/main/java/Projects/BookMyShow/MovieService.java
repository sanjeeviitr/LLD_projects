package Projects.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<Show> showAvailableShows(Movie movie){
        List<Show> shows = new ArrayList<>();

        //1000* 20 * 10
        List<Theater> theaterList = movie.getTheaterList();
        for(Theater theater : theaterList){
            List<Screen> screenList = theater.getScreenList();
            for(Screen screen : screenList){
                List<Show> showList = screen.getShowList();
                for(Show show : showList){
                    if(show.getMovieId().equals(movie.getMovieId())){
                        shows.add(show);
                    }
                }
            }
        }
        return shows;
    }
}

/*
showAvailableShows(Movie movie) -> List<Show>- MovieService

Movie -> theaters -> screens -> shows (return this)
 */
