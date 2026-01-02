package org.example.Parking_Lot;

import java.util.Map;

public class NearToEntryStrategy implements IParkingStrategy{
    private final ParkingSpace space;

    public NearToEntryStrategy(ParkingSpace space){
        this.space = space;
    }
    @Override
    public ParkingSlot findSlot(Vehicle v) {
        Map<String, ParkingSlot> mp = space.getLots();
        for(String s : mp.keySet()){
            if(mp.get(s).isLotAvailable()){
                mp.get(s).setLotAvailability();
                return mp.get(s);
            }
        }
        return null;
    }
}
