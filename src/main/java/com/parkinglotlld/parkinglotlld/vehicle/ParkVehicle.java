package com.parkinglotlld.parkinglotlld.vehicle;

public class ParkVehicle {
    int floor;
    int startIndex;
    int endIndex;
    Vehicle pl[][];
    Vehicle vehicle;
    FindFreeSlot findFreeSlot;
    Pair result;
    public ParkVehicle(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle,FindFreeSlot findFreeSlot)
    {
        this.startIndex=startIndex;
        this.endIndex=endIndex;
        this.floor=floor;
        this.pl=pl;
        this.vehicle=vehicle;
        this.findFreeSlot=findFreeSlot;
        this.result=findSlotLocation(startIndex, endIndex, floor, pl, vehicle, findFreeSlot);
    }

    public Pair findSlotLocation(int startIndex,int endIndex,int floor,Vehicle pl[][],Vehicle vehicle,FindFreeSlot findFreeSlot)
    {
        return findFreeSlot.slotLocation(startIndex, endIndex, floor, pl, vehicle);
    }
}
