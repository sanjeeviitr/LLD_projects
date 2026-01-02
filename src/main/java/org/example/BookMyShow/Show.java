package org.example.BookMyShow;

import java.time.Instant;
import java.time.LocalTime;

public class Show {

    private Movie movie;

    public Screen getScreen() {
        return screen;
    }

    private Screen screen;
    private LocalTime startTime;

    public Show(Movie movie, Screen screen, LocalTime startTime){
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
    }


}
