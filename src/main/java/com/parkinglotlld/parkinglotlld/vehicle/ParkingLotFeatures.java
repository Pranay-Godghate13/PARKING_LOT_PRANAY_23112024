package com.parkinglotlld.parkinglotlld.vehicle;

public interface ParkingLotFeatures {
    public void park(Vehicle vehicle);
    public void unPark(String ticket_ID);
    public void freeSlotNo(Vehicle vehicle);
    public void freeSlot(Vehicle vehicle);
    public void occupiedSlot(Vehicle vehicle);
}
