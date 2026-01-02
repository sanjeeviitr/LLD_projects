package org.example.BookMyShow;

import java.time.Instant;

public class Movie {

    private String movieName;
    private String movieId;
    private int runtime;

    public Movie(String name, String id, int runtime){
        this.movieName = name;
        this.movieId = id;
        this.runtime = runtime;
    }

    public String getMovieId(){
        return movieId;
    }
}
