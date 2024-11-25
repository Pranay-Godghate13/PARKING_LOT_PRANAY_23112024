package com.parkinglotlld.parkinglotlld;


import com.parkinglotlld.parkinglotlld.vehicle.BuildParking;
import com.parkinglotlld.parkinglotlld.vehicle.Car;
import com.parkinglotlld.parkinglotlld.vehicle.ParkingLot;
import com.parkinglotlld.parkinglotlld.vehicle.Truck;
import com.parkinglotlld.parkinglotlld.vehicle.Vehicle;
import com.parkinglotlld.parkinglotlld.vehicle.VehicleCount;

public class Main {
    public static void main(String args[])
    {
        ParkingLot parkingLot=new ParkingLot();
        parkingLot.build("PR1234",3,6);
        Truck truck1=new Truck("KA-01-DB-1234","RED");
        Truck truck2=new Truck("KA-01-DB-4321","BLACK");
        Truck truck3=new Truck("KA-01-DB-2341","GREY");
        Truck truck4=new Truck("KA-01-DB-2341","GREY");
        Car car1=new Car("KA-02-CB-1334", "BLACK");
        truck1.build();
        truck2.build();
        truck3.build();
        truck4.build();
        car1.build();
        //parkingLot.freeSlotNo(car1);
        //parkingLot.freeSlotNo(truck1);
        //parkingLot.freeSlot(car1);
        parkingLot.freeSlot(truck1);
        parkingLot.occupiedSlot(car1);
        parkingLot.park(car1);
        parkingLot.park(truck1);
        parkingLot.park(truck2);
        parkingLot.park(truck3);
        parkingLot.occupiedSlot(truck1);   
        parkingLot.park(truck4);
        parkingLot.occupiedSlot(car1);        
        
        
    }
}
