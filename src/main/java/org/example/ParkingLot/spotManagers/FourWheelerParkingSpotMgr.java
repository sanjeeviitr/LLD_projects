package org.example.ParkingLot.spotManagers;

import org.example.ParkingLot.parkingStrategy.IParkingStrategy;
import org.example.ParkingLot.parkingSpot.ParkingSpot;

import java.util.List;

public class FourWheelerParkingSpotMgr extends ParkingSpotManager {
    public FourWheelerParkingSpotMgr(List<ParkingSpot> spots, IParkingStrategy strategy) {
        super(spots, strategy);
    }
}
