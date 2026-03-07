package Projects.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String cityName;
    private String cityId;
    private List<Theater> theaterList;
    private List<Movie> movieList;

    public City(String cityName, String cityId) {
        this.cityName = cityName;
        this.cityId = cityId;
        this.theaterList = new ArrayList<>();
        this.movieList = new ArrayList<>();
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(List<Theater> theaterList) {
        this.theaterList = theaterList;
    }
}

/*
City
name;
cityId;
List<Theater> theaters;
 */
