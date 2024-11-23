package com.parkinglotlld.parkinglotlld.vehicle;

public class SpecifiedVehicle implements VehicleDetails {
    String type;
    String regId;
    String color;
    @Override
    public void vehicle(String type,String regId, String color) {
        this.regId=regId;
        this.color=color;
        this.type=type;
        System.out.println(this.type+" registration id is "+this.regId+" and color is "+this.color);
    }
    
}
