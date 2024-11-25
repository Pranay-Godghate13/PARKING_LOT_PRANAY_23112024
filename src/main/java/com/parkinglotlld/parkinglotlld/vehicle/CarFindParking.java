package com.parkinglotlld.parkinglotlld.vehicle;

public class CarFindParking extends ParkVehicle {
    public CarFindParking(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle,FindFreeSlot findFreeSlot)
    {
        super(startIndex,endIndex,floor,pl,vehicle,findFreeSlot);
    }
}
