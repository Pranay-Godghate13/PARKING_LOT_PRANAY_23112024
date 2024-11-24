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
        Vacancy vacancy=null;
        String type=vehicle.type;
        switch(type)
        {
            case "Truck":
            vacancy=new TruckFreeCount();
            break;
            case "Bike":
            vacancy=new BikeFreeCount();
            break;
            case "Car":
            vacancy=new CarFreeCount();
            break;

        } 
        int count=vacancy.CountFreeSlot(pl, floor, slot);
        if(count==0)
        System.out.println("No parking available");
        else
        {
            Location location=null;
            switch(type)
            {
                
                case "Truck":
                location=new TruckParkLocation();
                break;
                case "Bike":
                location=new BikeParkLocation();
                break;
                case "Car":
                location=new CarParkLocation();
                break;

            }
            location.parkVehicle(pl, vehicle, floor, slot);   
        }
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
