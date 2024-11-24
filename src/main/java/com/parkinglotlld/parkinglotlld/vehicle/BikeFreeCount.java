package com.parkinglotlld.parkinglotlld.vehicle;

public class BikeFreeCount implements Vacancy {

    @Override
    public int CountFreeSlot(Vehicle[][] pl, int floor, int slot) {
        int count=0;
        for(int i=0;i<floor;i++)
        {
            for(int j=1;j<3;j++)
            {
                if(pl[i][j]==null)
                count++;
            }
        }
        return count;
    }
    
}
