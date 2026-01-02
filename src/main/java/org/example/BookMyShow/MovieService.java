package org.example.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {

    private List<Movie> allMovies;
    private Map<City, List<Movie>> cityVsMovies;

    public MovieService(){
        this.allMovies = new ArrayList<>();
        this.cityVsMovies = new HashMap<>();
    }

    public void addMovie(Movie movie){
        this.allMovies.add(movie);
    }

    public void addMovieInCity(Movie movie, City city){
        this.allMovies.add(movie);
        List<Movie> movies = this.cityVsMovies.get(city);
        if(movies == null){
            movies = new ArrayList<>();
        }
        movies.add(movie);
        this.cityVsMovies.put(city, movies);
    }



}
