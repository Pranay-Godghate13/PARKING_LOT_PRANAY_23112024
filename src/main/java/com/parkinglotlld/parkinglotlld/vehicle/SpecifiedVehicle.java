package com.parkinglotlld.parkinglotlld.vehicle;

public class SpecifiedVehicle implements VehicleDetails {
    String regId;
    String color;
    @Override
    public void vehicle(String regId, String color) {
        this.regId=regId;
        this.color=color;
        System.out.println("The registration id is "+regId+" and color is "+color);
    }
    
}
