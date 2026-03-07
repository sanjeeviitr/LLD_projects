package Projects.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String movieId;
    private String movieName;
    private List<Theater> theaterList;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(String movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.theaterList = new ArrayList<>();
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }
}

/*
Movie
movieId
movieName
 */
