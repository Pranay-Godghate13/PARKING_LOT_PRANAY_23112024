package com.parkinglotlld.parkinglotlld.vehicle;

public class TruckParkLocation implements Location{

    @Override
    public void parkVehicle(Vehicle[][] pl, Vehicle vehicle, int floor, int slot) {
        boolean flag=false;
        for(int i=0;i<floor;i++)
        {
            for(int j=0;j<1;j++)
            {
                if(pl[i][j]==null)
                {
                    pl[i][j]=vehicle;
                    flag=true;
                    System.out.println(vehicle.type+" was parked on "+(i+1)+" floor in "+(j+1)+" slot");
                    break;
                }
                

            }
            if(flag==true)
            break;
        }
    }
    
}
