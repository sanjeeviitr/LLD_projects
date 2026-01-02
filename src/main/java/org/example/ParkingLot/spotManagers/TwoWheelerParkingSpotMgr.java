package org.example.ParkingLot.spotManagers;

import org.example.ParkingLot.parkingStrategy.NearestToEntryParkingStrategy;
import org.example.ParkingLot.parkingSpot.ParkingSpot;

import java.util.List;

public class TwoWheelerParkingSpotMgr extends ParkingSpotManager {


    public TwoWheelerParkingSpotMgr(List<ParkingSpot> spots, NearestToEntryParkingStrategy strategy) {
        super(spots, strategy);

    }
}
