package org.example.ParkingLot;

import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.spotManagers.ParkingSpotManager;
import org.example.ParkingLot.vehicle.Vehicle;

public class EntryGate {

    private ParkingSpotManager manager;
//    private ParkingSpotMgrFactory factory;
//
//    public EntryGate(ParkingSpotMgrFactory factory, ParkingSpotManager manager){
//        this.manager = manager;
//        this.factory = factory;
//    }

    public EntryGate( ParkingSpotManager manager){
        this.manager = manager;
    }



    public ParkingSpot findParkingSpace(Vehicle v){
        return this.manager.findParkingSpace(v);
    }
}
