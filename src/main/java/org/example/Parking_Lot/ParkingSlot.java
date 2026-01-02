package org.example.Parking_Lot;

public class ParkingSlot {
    
    private SlotType slotType;
    private boolean isLotAvailable;
    private String id;
    
    public ParkingSlot(SlotType type, String id){
        this.slotType = type;
        this.isLotAvailable = true;
        this.id = id;
    }

    public String getId(){
        return id;
    }
    
    public boolean isLotAvailable(){
        return isLotAvailable;
    }
    
    public void setLotAvailability(){
        this.isLotAvailable = !this.isLotAvailable;
    }
    
    
    
}
