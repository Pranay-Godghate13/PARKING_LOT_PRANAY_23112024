package com.parkinglotlld.parkinglotlld.vehicle;

public class FreeSlotNumber implements CountSlot {

    @Override
    public void displaySlots(Vehicle[][] pl, int startIndex, int endIndex,int floor,Vehicle vehicle) {
        int count=0;
        for(int i=0;i<floor;i++)
        {
            
            for(int j=startIndex;j<endIndex;j++)
            {
                if(pl[i][j]==null)
                count++;
            }
            System.out.println("No. of free slots for "+vehicle.type+" on Floor "+(i+1)+" : "+count);
            count=0;
        }
        
    }
    
}
