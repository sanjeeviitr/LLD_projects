package org.example.ParkingLot;

import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.vehicle.Vehicle;

import java.time.Instant;
import java.util.UUID;

public class Ticket {

    private Instant entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private String id;

    public Ticket(Vehicle vehicle, ParkingSpot spot){
        this.entryTime = Instant.now();
        this.vehicle = vehicle;
        this.parkingSpot = spot;
        this.id = UUID.randomUUID().toString();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public ParkingSpot getParkingSpot(){
        return parkingSpot;
    }

    public String getId(){
        return id;
    }


}
