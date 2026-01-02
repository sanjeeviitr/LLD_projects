package org.example.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreService {

    private List<Theatre> theaters;
    private Map<Movie, List<Theatre>> movieVsYTheatres;

    public TheatreService(){
        this.theaters = new ArrayList<>();
        this.movieVsYTheatres = new HashMap<>();
    }

    public void addTheatres(Theatre theatre){
        this.theaters.add(theatre);
    }
    
    public void addMovieInTheatre(Movie movie, Theatre theatre){
        City city = theatre.getCity();
        List<Theatre> theatres = movieVsYTheatres.get(movie);
        if(theatres == null){
            theatres = new ArrayList<>();
        }
        theatres.add(theatre);
        this.movieVsYTheatres.put(movie, theatres);
    }

    public List<Theatre> showAvailableTheatres(Movie movie, City city){
        return movieVsYTheatres.get(movie);
    }
}
