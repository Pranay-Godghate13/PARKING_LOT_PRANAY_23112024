package com.parkinglotlld.parkinglotlld.vehicle;

public class VehicleCount {
    int startIndex;
    int endIndex;
    int floor;
    CountSlot countSlot;
    Vehicle pl[][];
    Vehicle vehicle;
    public VehicleCount(int startIndex,int endIndex,int floor,Vehicle pl[][],CountSlot countSlot,Vehicle vehicle)
    {
        this.startIndex=startIndex;
        this.endIndex=endIndex;
        this.pl=pl;
        this.floor=floor;
        this.countSlot=countSlot;
        this.vehicle=vehicle;
        checkSlot(pl, startIndex, endIndex,floor,vehicle);
    }

    public void checkSlot(Vehicle pl[][],int startIndex,int endIndex,int floor,Vehicle vehicle)
    {
        countSlot.displaySlots(pl, startIndex, endIndex,floor,vehicle);
    }
    
} 