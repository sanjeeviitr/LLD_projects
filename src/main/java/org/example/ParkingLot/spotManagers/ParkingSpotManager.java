package org.example.ParkingLot.spotManagers;

import org.example.ParkingLot.Ticket;
import org.example.ParkingLot.vehicle.Vehicle;
import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.parkingStrategy.IParkingStrategy;

import java.util.List;

public class ParkingSpotManager {

    private List<ParkingSpot> spots;
    private IParkingStrategy strategy;

    public ParkingSpotManager(List<ParkingSpot> spots, IParkingStrategy strategy){
        this.spots = spots;
        this.strategy =strategy;
    }

    public void addParkingSpot(ParkingSpot spot){
        this.spots.add(spot);
    }

    public ParkingSpot findParkingSpace(Vehicle v){
       return this.strategy.parkVehicle(v, spots);
    }

//    public boolean allotParkingSpace(Vehicle v, ParkingSpot spot){
//        return spot.parkVehicle(v);
//    }

    public Ticket generateTicket(Vehicle v, ParkingSpot spot){
        System.out.println("generating ticket");
        return new Ticket(v, spot);
    }

    public boolean parkVehicle(Vehicle v, ParkingSpot spot) {
        return spot.parkVehicle(v);
    }

    public void removeVehicle(ParkingSpot spot) {
        spot.removeVehicle();
    }

}
