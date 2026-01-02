package org.example.BookMyShow;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class SeatLock {

    private ShowSeat showSeat;
    private Instant lockTime;
    private Instant expiryTime;
    private User user;

    public SeatLock(ShowSeat showSeat, User user){
        this.showSeat = showSeat;
        this.user = user;
        this.lockTime = Instant.now();
        this.expiryTime =  Instant.now().plus(10, ChronoUnit.MINUTES);
    }



}
