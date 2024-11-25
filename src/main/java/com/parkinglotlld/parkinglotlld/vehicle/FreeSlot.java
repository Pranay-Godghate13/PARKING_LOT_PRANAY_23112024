package com.parkinglotlld.parkinglotlld.vehicle;

import java.util.ArrayList;
import java.util.List;

public class FreeSlot implements CountSlot {

    @Override
    public void displaySlots(Vehicle[][] pl, int startIndex, int endIndex, int floor, Vehicle vehicle) {
       for(int i=0;i<floor;i++)
       {
        List<Integer> list=new ArrayList<>();
        for(int j=startIndex;j<endIndex;j++)
        {
            if(pl[i][j]==null)
            list.add(j+1);
        }
        System.out.println("Free slots for "+vehicle.type+" on Floor "+(i+1)+" : "+list);
        list.clear();
       }
    }
    
}
