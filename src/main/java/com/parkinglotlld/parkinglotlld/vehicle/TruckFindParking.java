package com.parkinglotlld.parkinglotlld.vehicle;

public class TruckFindParking extends ParkVehicle {
    public TruckFindParking(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle,FindFreeSlot findFreeSlot)
    {
        super(startIndex,endIndex,floor,pl,vehicle,findFreeSlot);
    }
}
