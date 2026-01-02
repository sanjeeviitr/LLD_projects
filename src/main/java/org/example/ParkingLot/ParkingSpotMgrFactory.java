package org.example.ParkingLot;

import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.parkingStrategy.NearestToEntryParkingStrategy;
import org.example.ParkingLot.spotManagers.FourWheelerParkingSpotMgr;
import org.example.ParkingLot.spotManagers.ParkingSpotManager;
import org.example.ParkingLot.spotManagers.TwoWheelerParkingSpotMgr;
import org.example.ParkingLot.vehicle.Vehicle;

import java.util.List;

public class ParkingSpotMgrFactory {

    private ParkingSpotManager manager;

    public ParkingSpotManager getManager(Vehicle v, List<ParkingSpot> spots, NearestToEntryParkingStrategy strategy) {

        switch (v.getVehicleType()){
            case TWO_WHEELER -> {
                return new TwoWheelerParkingSpotMgr(spots, strategy);
            }
            case FOUR_WHEELER -> {
                return new FourWheelerParkingSpotMgr(spots, strategy);
            }
        }
        return null;
    }
}
