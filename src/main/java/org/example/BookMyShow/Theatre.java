package org.example.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private String theatreName;
    private City city;
    private String address;
    private List<Screen> screens;
    private List<Show> shows;

    public Theatre(String name, City city, String address){
        this.theatreName = name;
        this.address = address;
        this.city =city;
        this.screens = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public void addScreen(Screen screen){
        this.screens.add(screen);
    }

    public void addShow(Show show){
        SeatShowManager manager = new SeatShowManager();
        manager.addShow(show);
        this.shows.add(show);
    }

    public City getCity(){
        return city;
    }

}
