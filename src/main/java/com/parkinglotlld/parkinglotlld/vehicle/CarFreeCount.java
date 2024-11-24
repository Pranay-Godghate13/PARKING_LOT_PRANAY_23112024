package com.parkinglotlld.parkinglotlld.vehicle;

public class CarFreeCount implements Vacancy{

    @Override
    public int CountFreeSlot(Vehicle[][] pl,int floor,int slot) {
        int count=0;
        for(int i=0;i<floor;i++)
        {
            for(int j=3;j<slot;j++)
            {
                if(pl[i][j]==null)
                count++;
            }
        }
        return count;
    }
    
}
