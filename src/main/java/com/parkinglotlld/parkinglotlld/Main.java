package com.parkinglotlld.parkinglotlld;

import com.parkinglotlld.parkinglotlld.vehicle.Car;
import com.parkinglotlld.parkinglotlld.vehicle.Truck;
import com.parkinglotlld.parkinglotlld.vehicle.Vehicle;

public class Main {
    public static void main(String args[])
    {
        Truck truck1=new Truck("KA-01-DB-1234","RED");
        Car car1=new Car("KA-02-CB-1334", "BLACK");
        truck1.build();
        car1.build();
        
        
    }
}
