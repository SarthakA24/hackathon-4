package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderServiceTest {
    FileReaderService fileReaderService;

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
        String fileName = "src/test/resources/sample.csv";
        List<Ticket> ticketList = fileReaderService.readFile(fileName);
        Ticket ticket = new Ticket("KIAS-12/5", "KIAS-12UP", 9387, 1, 11359, 39, "01/09/2018", "02:02:58", 281.0, 49.3);
        Assertions.assertEquals(ticket, ticketList.get(0), "There is some error in the logic!!");
    }

    @Test
    void readFileFailure() {
        Assertions.assertThrows(RuntimeException.class, () -> fileReaderService.readFile("src/test/resources/sample1.csv"));
    }

    @Test
    void readFileFailureWithIncorrectEntries() {
        Assertions.assertThrows(NumberFormatException.class, () -> fileReaderService.readFile("src/test/resources/sample_values_changed.csv"));
    }
}