package org.example.Parking_Lot;

public class Vehicle {

    private String id;
    private VehicleType type;

    public Vehicle(String id, VehicleType type){
        this.id = id;
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }
}
