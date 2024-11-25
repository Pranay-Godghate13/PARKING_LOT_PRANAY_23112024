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
        String type=vehicle.type;
        ParkVehicle parkVehicle=null;
        switch(type)
        {
            case "Car":
            parkVehicle=new CarFindParking(3, this.slot,this.floor, this.pl,vehicle, new CommonSlotFinder());
            break;
            case "Bike":
            parkVehicle=new BikeFindParking(1, 3,this.floor, this.pl,vehicle, new CommonSlotFinder());
            break;
            case "Truck":
            parkVehicle=new TruckFindParking(0, 1,this.floor, this.pl,vehicle, new CommonSlotFinder());
            break;

        }
        Pair location=parkVehicle.result;
        int floor_no=location.floor;
        int slot_no=location.slot;
        if(floor_no!=-1 && slot_no!=-1)
        {
            pl[floor_no][slot_no]=vehicle;
            Ticket parking_ticket=new Ticket(id,floor_no+1,slot_no+1);
            String ticket=parking_ticket.createTicket();
            System.out.println("Parked vehicle. Ticket ID: "+ticket);

        }
        else
        {
            System.out.println("Parking Lot Full");
        }

    }

    @Override
    public void unPark(Vehicle vehicle) {
        
    }

    @Override
    public void freeSlotNo(Vehicle vehicle) {
        slot(new FreeSlotNumber(), vehicle);    
    }

    @Override
    public void freeSlot(Vehicle vehicle) {
        slot(new FreeSlot(),vehicle);
    }

    @Override
    public void occupiedSlot(Vehicle vehicle) {
        slot(new OccupiedSlot(), vehicle);
    }
    public void slot(CountSlot countSlot,Vehicle vehicle)
    {
        String type=vehicle.type;
        VehicleCount vehicleCount;
        switch(type)
        {
            case "Car":
            vehicleCount=new CarCount(3, this.slot, this.floor, pl,countSlot, vehicle);
            break;
            case "Bike":
            vehicleCount=new BikeCount(1, 3, this.floor, pl,countSlot, vehicle);
            break;
            case "Truck":
            vehicleCount=new TruckCount(0, 1, this.floor, pl,countSlot, vehicle);
            break;

        }
    }

    
    
}
