package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;

import java.util.Comparator;
import java.util.List;

public class DataService {
    public List<Ticket> sortByDistance (List<Ticket> ticketList) {
        ticketList.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return Double.compare(o2.getTravelledKilometer(),o1.getTravelledKilometer());
            }
        });
        return ticketList;
    }
}
