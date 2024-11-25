package com.parkinglotlld.parkinglotlld.vehicle;

import java.util.ArrayList;
import java.util.List;

public class OccupiedSlot implements CountSlot {

    @Override
    public void displaySlots(Vehicle[][] pl, int startIndex, int endIndex, int floor, Vehicle vehicle) {
        for(int i=0;i<floor;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=startIndex;j<endIndex;j++)
            {
                if(pl[i][j]!=null)
                list.add(j);
            }
            System.out.println("Occupied slots for "+vehicle.type+ " on Floor "+floor+" : "+list);
            list.clear();
        }
    }
    
}
