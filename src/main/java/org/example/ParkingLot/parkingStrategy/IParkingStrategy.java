package org.example.ParkingLot.parkingStrategy;

import org.example.ParkingLot.vehicle.Vehicle;
import org.example.ParkingLot.parkingSpot.ParkingSpot;

import java.util.List;

public interface IParkingStrategy {

    ParkingSpot parkVehicle(Vehicle v, List<ParkingSpot> spots);
}
