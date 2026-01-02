package org.example.ParkingLot;

import org.example.ParkingLot.parkingSpot.ParkingSpot;
import org.example.ParkingLot.vehicle.Vehicle;

public class TicketService {

    public TicketService(){

    }

    public Ticket generateTicket(Vehicle v, ParkingSpot spot){
        return new Ticket(v, spot);
    }
}
