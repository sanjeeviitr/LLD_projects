package org.example.Parking_Lot;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSpace {

    private Map<String, ParkingSlot> lotMap;

    public ParkingSpace(){
        this.lotMap = new ConcurrentHashMap<>();
    }

    public Map<String, ParkingSlot> getLots(){
        return lotMap;
    }

    public void addLot(ParkingSlot lot){
        lotMap.put(lot.getId(), lot);
    }
}
