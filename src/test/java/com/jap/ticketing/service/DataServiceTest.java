package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;
import org.junit.jupiter.api.AfterEach;
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
    void sortByDistance() {
    }

    @Test
    void totalCollectionMadeByTicketSales() {
    }
}