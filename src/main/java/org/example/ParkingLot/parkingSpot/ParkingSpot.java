package org.example.ParkingLot.parkingSpot;

import org.example.ParkingLot.StatusType;
import org.example.ParkingLot.vehicle.Vehicle;

import java.util.UUID;

public class ParkingSpot {

    private StatusType status;
    private String id;
    private Vehicle vehicle;
    private int price;

    public ParkingSpot(int price){
        this.status = StatusType.FREE;
        this.vehicle = null;
        this.id = UUID.randomUUID().toString();
        this.price = price;
    }

    public boolean parkVehicle(Vehicle v){
        if(this.vehicle != null) return false;
        this.vehicle = v;
        return true;
    }

    public void removeVehicle(){
        this.vehicle = null;
    }

    public StatusType getStatus(){
        return status;
    }

    public int getPrice(){
       return this.price;
    }


}
