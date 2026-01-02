package org.example.Parking_Lot;

import java.time.Instant;
import java.util.UUID;

public class Ticket {

    private ParkingSlot slot;
    private Vehicle vehicle;
    private Instant entryTime;
    private String  id;

    public Ticket(ParkingSlot slot, Vehicle vehicle){
        this.slot = slot;
        this.vehicle = vehicle;
        this.entryTime = Instant.now();
        this.id = UUID.randomUUID().toString();
    }

    public String getId(){
        return id;
    }
}
