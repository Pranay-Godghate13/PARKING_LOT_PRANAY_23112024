package com.parkinglotlld.parkinglotlld.vehicle;

public class CommonSlotFinder implements FindFreeSlot {

    @Override
    public Pair slotLocation(int startIndex, int endIndex, int floor, Vehicle[][] pl, Vehicle vehicle) {
        for(int i=0;i<floor;i++)
        {
            for(int j=startIndex;j<endIndex;j++)
            {
                if(pl[i][j]==null)
                return new Pair(i, j);
            }
        }
        return new Pair(-1,-1);
    }
    
}
