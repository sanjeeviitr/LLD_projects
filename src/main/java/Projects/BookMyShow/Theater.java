package Projects.BookMyShow;

import java.util.List;

public class Theater {
    private String theaterId;
    private String theaterName;
    private String theateeAddress;
    private List<Screen> screenList;

    public Theater(String theaterId, String theaterName, String theateeAddress, List<Screen> screenList) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
        this.theateeAddress = theateeAddress;
        this.screenList = screenList;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheateeAddress() {
        return theateeAddress;
    }

    public void setTheateeAddress(String theateeAddress) {
        this.theateeAddress = theateeAddress;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }
}


/*
Theater
theaterId;
theaterName;
theaterAddress,
List<Screen> screens
 */