package com.jap.ticketing.service;


import com.jap.ticketing.model.Ticket;

import java.util.Comparator;

@FunctionalInterface
public interface DistanceComparator extends Comparator<Ticket> {

    @Override
    int compare(Ticket o1, Ticket o2);
}
