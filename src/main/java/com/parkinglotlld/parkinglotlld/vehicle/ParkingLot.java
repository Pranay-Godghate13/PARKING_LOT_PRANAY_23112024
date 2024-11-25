package com.parkinglotlld.parkinglotlld.vehicle;

public class ParkingLot implements BuildParking,ParkingLotFeatures {
    Vehicle pl[][];
    String id;
    int floor;
    int slot;
    @Override
    public void build(String id, int floor, int slot) {
        this.id=id;
        this.floor=floor;
        this.slot=slot;
        pl=new Vehicle[this.floor][this.slot];
    }

    @Override
    public void park(Vehicle vehicle) {
        
    }

    @Override
    public void unPark(Vehicle vehicle) {
        
    }

    @Override
    public void freeSlotNo(Vehicle vehicle) {
        String type=vehicle.type;
        VehicleCount vehicleCount;
        switch(type)
        {
            case "Car":
            vehicleCount=new CarCount(3, this.slot, this.floor, pl,new FreeSlotNumber(), vehicle);
            break;
            case "Bike":
            vehicleCount=new BikeCount(1, 3, this.floor, pl,new FreeSlotNumber(), vehicle);
            break;
            case "Truck":
            vehicleCount=new TruckCount(0, 1, this.floor, pl,new FreeSlotNumber(), vehicle);
            break;

        }
    }

    @Override
    public void freeSlot(Vehicle vehicle) {
        String type=vehicle.type;
        VehicleCount vehicleCount;
        switch(type)
        {
            case "Car":
            vehicleCount=new CarCount(3, this.slot, this.floor, pl,new FreeSlot(), vehicle);
            break;
            case "Bike":
            vehicleCount=new BikeCount(1, 3, this.floor, pl,new FreeSlot(), vehicle);
            break;
            case "Truck":
            vehicleCount=new TruckCount(0, 1, this.floor, pl,new FreeSlot(), vehicle);
            break;

        }
    }

    @Override
    public void occupiedSlot(Vehicle vehicle) {
        String type=vehicle.type;
        VehicleCount vehicleCount;
        switch(type)
        {
            case "Car":
            vehicleCount=new CarCount(3, this.slot, this.floor, pl,new OccupiedSlot(), vehicle);
            break;
            case "Bike":
            vehicleCount=new BikeCount(1, 3, this.floor, pl,new OccupiedSlot(), vehicle);
            break;
            case "Truck":
            vehicleCount=new TruckCount(0, 1, this.floor, pl,new OccupiedSlot(), vehicle);
            break;

        }
    }

    
    
}
