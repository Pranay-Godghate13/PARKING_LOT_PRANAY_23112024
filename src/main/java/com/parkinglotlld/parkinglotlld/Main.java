package com.parkinglotlld.parkinglotlld;


import com.parkinglotlld.parkinglotlld.vehicle.BuildParking;
import com.parkinglotlld.parkinglotlld.vehicle.Car;
import com.parkinglotlld.parkinglotlld.vehicle.CountFree;
import com.parkinglotlld.parkinglotlld.vehicle.ParkingLot1;
import com.parkinglotlld.parkinglotlld.vehicle.Truck;
import com.parkinglotlld.parkinglotlld.vehicle.Vehicle;

public class Main {
    public static void main(String args[])
    {
        ParkingLot1 parkingLot=new ParkingLot1();
        parkingLot.build("PR1234",2,6);
        Truck truck1=new Truck("KA-01-DB-1234","RED");
        Truck truck2=new Truck("KA-01-DB-4321","BLACK");
        Truck truck3=new Truck("KA-01-DB-2341","GREY");
        Car car1=new Car("KA-02-CB-1334", "BLACK");
        truck1.build();
        truck2.build();
        truck3.build();
        car1.build();
        parkingLot.update(new CountFree());
        parkingLot.park(car1);
        parkingLot.park(truck1);
        parkingLot.park(truck2);
        parkingLot.park(truck3);
        
        
        
    }
}
