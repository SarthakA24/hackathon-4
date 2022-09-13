package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        List<Ticket> sortedTicketList = dataService.sortByDistance(ticketList);
        Assertions.assertEquals(49, sortedTicketList.size(), "There is some error in the logic!!");
        Assertions.assertEquals(49.5, sortedTicketList.get(0).getTravelledKilometer(), "There is some error in the logic!!");
    }

    @Test
    void totalCollectionMadeByTicketSales() {
        Assertions.assertEquals(10348.0, dataService.totalCollectionMadeByTicketSales(ticketList));
    }
}