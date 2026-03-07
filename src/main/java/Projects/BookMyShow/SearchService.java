package Projects.BookMyShow;

import java.util.List;

public class SearchService {

    public List<Movie> showAvailableMovies(City city){
        return city.getMovieList();
    }
}

/*

showAvailableMovies(City city) -> List<Movie> SearchService
 */
