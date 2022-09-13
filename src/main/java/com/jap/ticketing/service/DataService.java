package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;

import java.util.Comparator;
import java.util.List;

public class DataService {

    /**
     * This method sorts the given Tickets List in descending order by Distance Travelled
     * @param ticketList The Ticket List that needs to be sorted
     * @return The sorted Ticket List
     */
    public List<Ticket> sortByDistance (List<Ticket> ticketList) {
        ticketList.sort(Comparator.comparingDouble(Ticket::getTravelledKilometer).reversed());
        return ticketList;
    }

    public double totalCollectionMadeByTicketSales(List<Ticket> ticketList){
        double totalCollection = 0;
        return totalCollection;
    }
}
