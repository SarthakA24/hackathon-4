package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;

import java.util.Comparator;
import java.util.List;

public class DataService {
    public List<Ticket> sortByDistance (List<Ticket> ticketList) {
        ticketList.sort(Comparator.comparingDouble(Ticket::getTravelledKilometer).reversed());
        return ticketList;
    }

    public double totalCollectionMadeByTicketSales(List<Ticket> ticketList){
        double totalCollection = 0;
        return totalCollection;
    }
}
