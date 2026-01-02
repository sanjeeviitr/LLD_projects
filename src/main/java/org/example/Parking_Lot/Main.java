//package org.example.Parking_Lot;
//
//public class Main {
//
//    public static void main(String[] args) {
//        ParkingSlot lot1 = new ParkingSlot(SlotType.MEDIUM, "1");
//        ParkingSlot lot2 = new ParkingSlot(SlotType.SMALL, "2");
//        ParkingSlot lot3 = new ParkingSlot(SlotType.BIG, "3");
//        ParkingSlot lot4 = new ParkingSlot(SlotType.MEDIUM, "4");
//        ParkingSlot lot5 = new ParkingSlot(SlotType.SMALL, "5");
//
//        ParkingSpace space = new ParkingSpace();
//        space.addLot(lot1);
//        space.addLot(lot2);
//        space.addLot(lot3);
//        space.addLot(lot4);
//        space.addLot(lot5);
//
//        Vehicle v1 = new Vehicle("1", VehicleType.TWO_WHEELER);
//        ParkingLotManager mgr = new TwoWheelerParkingManager(new NearToEntryStrategy(space));
//        String id  = mgr.findParking(v1);
//        System.out.println("Ticket id is : "  + id );
//
//
//    }
//}
