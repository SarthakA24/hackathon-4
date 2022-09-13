package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderServiceTest {
    FileReaderService fileReaderService;
    private final String FILENAME = "src/test/resources/sample.csv";
    private final String INCORRECT_FILENAME = "src/test/resources/sample1.csv";

    @BeforeEach
    void setUp() {
        fileReaderService = new FileReaderService();
    }

    @AfterEach
    void tearDown() {
        fileReaderService = null;
    }

    @Test
    void readFileSuccess() {
        List<Ticket> ticketList = fileReaderService.readFile(FILENAME);
        Ticket ticket = new Ticket(
                "KIAS-12/5",
                "KIAS-12UP",
                9387,
                1,
                11359,
                39,
                "01/09/2018",
                "02:02:58",
                281.0,
                49.3
        );
        Assertions.assertEquals(ticket, ticketList.get(0), "File has been Read Successfully!");
    }
}