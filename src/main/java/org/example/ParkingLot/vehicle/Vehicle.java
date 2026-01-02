package org.example.ParkingLot.vehicle;

public class Vehicle {

    private final String vehicleNo;
    private final VehicleType vehicleType;

    public Vehicle(String no, VehicleType type){
        this.vehicleNo = no;
        this.vehicleType = type;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
