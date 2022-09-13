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

    /**
     * This method finds the total amount collected by the ticket sales
     * @param ticketList The Tickets List for which the total needs to be calculated
     * @return the total collection made by sales of tickets
     */
    public double totalCollectionMadeByTicketSales(List<Ticket> ticketList){
        double totalCollection = 0;
        return totalCollection;
    }
}
