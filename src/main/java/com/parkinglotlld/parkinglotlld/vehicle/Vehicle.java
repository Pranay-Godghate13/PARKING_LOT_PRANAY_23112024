package com.parkinglotlld.parkinglotlld.vehicle;

public class Vehicle {
    VehicleDetails vehicleDetails;
    String regId;
    String color;
    public Vehicle(VehicleDetails vehicleDetails,String regId,String color)
    {
        this.vehicleDetails=vehicleDetails;
        this.regId=regId;
        this.color=color;
    }
    public void build()
    {
        vehicleDetails.vehicle(this.regId,this.color);
    }

}
