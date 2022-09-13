package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DataServiceTest {
    DataService dataService;
    FileReaderService fileReaderService;
    List<Ticket> ticketList;

    @BeforeEach
    void setUp() {
        dataService = new DataService();
        fileReaderService = new FileReaderService();
        ticketList = fileReaderService.readFile("src/test/resources/sample.csv");
    }

    @AfterEach
    void tearDown() {
        dataService = null;
        fileReaderService = null;
    }

    @Test
    void sortByDistanceSuccess() {
        Assertions.assertEquals(49, dataService.sortByDistance(ticketList).size(), "There is some error in the logic!!");
        Assertions.assertEquals(49.5, dataService.sortByDistance(ticketList).get(0).getTravelledKilometer(), "There is some error in the logic!!");
    }

    @Test
    void sortByDistanceFailure() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("KIAS-12/5", "KIAS-12UP", 9387, 1, 11359, 39, "01/09/2018", "02:02:58", 281.0, 49.3));
        tickets.add(null);
        Assertions.assertThrows(NullPointerException.class, () -> dataService.sortByDistance(tickets));
    }

    @Test
    void totalCollectionMadeByTicketSales() {
        Assertions.assertEquals(10348.0, dataService.totalCollectionMadeByTicketSales(ticketList));
    }
}