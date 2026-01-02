package org.example.ParkingLot;

import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.parkingSpot.TwoWheelerSpot;
import org.example.ParkingLot.parkingStrategy.IParkingStrategy;
import org.example.ParkingLot.parkingStrategy.NearestToEntryParkingStrategy;
import org.example.ParkingLot.spotManagers.ParkingSpotManager;
import org.example.ParkingLot.spotManagers.TwoWheelerParkingSpotMgr;
import org.example.ParkingLot.vehicle.Vehicle;
import org.example.ParkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ParkingSpot spot1 = new TwoWheelerSpot(100);
        List<ParkingSpot> spotList = new ArrayList<>();
        ParkingSpotManager mgr1 = new TwoWheelerParkingSpotMgr(spotList, new NearestToEntryParkingStrategy());
        mgr1.addParkingSpot(spot1);
        Vehicle v1 = new Vehicle("1", VehicleType.TWO_WHEELER);
       ParkingSpot spot =  mgr1.findParkingSpace(v1);
       Ticket t =  mgr1.generateTicket(v1, spot);
        System.out.println("ticket id is : " + t.getId());

    }
}
