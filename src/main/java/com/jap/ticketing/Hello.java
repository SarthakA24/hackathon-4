package com.jap.ticketing;

import com.jap.ticketing.model.Ticket;
import com.jap.ticketing.service.FileReaderService;

import java.util.List;

public class Hello {

    public static void main(String[] args) {
        String fileName = "src/main/resources/sample.csv";
        FileReaderService readerService = new FileReaderService();
        List<Ticket> ticketList = readerService.readFile(fileName);
    }
}
