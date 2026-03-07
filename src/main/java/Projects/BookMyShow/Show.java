package Projects.BookMyShow;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Show {

    private String showId;
    private String movieId;
    private String screenId;
    private Date startTime;
    private Date endTime;
    private Map<Seat, SeatStatus> seatStatusMap;

    public Show(String showId, String movieId, String screenId, Date startTime, Date endTime) {
        this.showId = showId;
        this.movieId = movieId;
        this.screenId = screenId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seatStatusMap = new ConcurrentHashMap<>();
    }

    public Map<Seat, SeatStatus> getSeatStatusMap() {
        return seatStatusMap;
    }

    public void setSeatStatusMap(Map<Seat, SeatStatus> seatStatusMap) {
        this.seatStatusMap = seatStatusMap;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }
}


/*
showId
movieId
screenId
startTime
endTime
Map<seatId, seatStatus> seatStatusMap
 */