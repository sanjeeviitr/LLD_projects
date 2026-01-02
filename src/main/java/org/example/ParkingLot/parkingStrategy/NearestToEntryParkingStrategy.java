package org.example.ParkingLot.parkingStrategy;

import org.example.ParkingLot.StatusType;
import org.example.ParkingLot.vehicle.Vehicle;
import org.example.ParkingLot.parkingSpot.ParkingSpot;

import java.util.List;

public class NearestToEntryParkingStrategy implements IParkingStrategy{
    @Override
    public ParkingSpot parkVehicle(Vehicle v, List<ParkingSpot> spots) {
        for(ParkingSpot spot : spots){
            if(spot.getStatus().equals(StatusType.FREE)){
                System.out.println("Sending nearest to entry spot");
                return spot;
            }
        }
        return null;
    }
}
