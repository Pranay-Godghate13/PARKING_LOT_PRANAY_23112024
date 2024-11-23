package com.parkinglotlld.parkinglotlld.vehicle;

public class Vehicle {
    VehicleDetails vehicleDetails;
    String regId;
    String color;
    String type;
    public Vehicle(VehicleDetails vehicleDetails,String regId,String color,String type)
    {
        this.vehicleDetails=vehicleDetails;
        this.regId=regId;
        this.color=color;
        this.type=type;
    }
    public void build()
    {
        vehicleDetails.vehicle(this.type,this.regId,this.color);
    }

}
