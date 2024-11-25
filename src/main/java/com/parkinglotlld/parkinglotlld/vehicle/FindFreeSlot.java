package com.parkinglotlld.parkinglotlld.vehicle;

public interface FindFreeSlot {
    public Pair slotLocation(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle);
}
