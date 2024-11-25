package com.parkinglotlld.parkinglotlld.vehicle;

public class Ticket {
    String id;
    int floor;
    int slot;
    public Ticket(String id,int floor,int slot)
    {
        this.id=id;
        this.floor=floor;
        this.slot=slot;
    }

    public String createTicket()
    {
        return id+"_"+floor+"_"+slot;
    }
    
} 