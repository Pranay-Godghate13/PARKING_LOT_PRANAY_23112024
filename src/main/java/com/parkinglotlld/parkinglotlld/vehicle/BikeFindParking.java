package com.parkinglotlld.parkinglotlld.vehicle;

public class BikeFindParking extends ParkVehicle {
    public BikeFindParking(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle,FindFreeSlot findFreeSlot)
    {
        super(startIndex,endIndex,floor,pl,vehicle,findFreeSlot);
    }
}
