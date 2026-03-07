package Projects.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private String screenId;
    private List<Show> showList;
    private List<Seat> seatList;

    public Screen(String screenId) {
        this.screenId = screenId;
        this.showList = new ArrayList<>();
        this.seatList = new ArrayList<>();
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}

/*
Screen
screenId
List<Show> shows
List<Seat> seats
 */
