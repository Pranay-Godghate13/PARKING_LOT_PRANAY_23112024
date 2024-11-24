package com.parkinglotlld.parkinglotlld.vehicle;
import java.util.*;
public class ParkingLot1 implements BuildParking,ParkingLotFeatures {
    String id;
    int floor;
    int slot;
    Vehicle pl[][];
    public void build(String id,int floor,int slot)
    {
        this.id=id;
        this.floor=floor;
        this.slot=slot;
        pl=new Vehicle[this.floor][this.slot];
    }
    public void park(Vehicle vehicle)
    {
        String type=vehicle.type;
        
        System.out.println(vehicle.type+" is parked");
    }
    public void unPark(Vehicle vehicle)
    {
        System.out.println(vehicle.type+" is unparked");
    }
    public void update(Display display)
    {
        display.display();
    }
}
