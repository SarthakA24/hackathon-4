package com.jap.ticketing;

import com.jap.ticketing.model.Ticket;
import com.jap.ticketing.service.DataService;
import com.jap.ticketing.service.FileReaderService;

import java.util.Iterator;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        // Create a fileName variable to hold the file path
        String fileName = "src/main/resources/sample.csv";
        // Create objects for the FileReaderService and DataService classes
        FileReaderService readerService = new FileReaderService();
        DataService dataService = new DataService();
        // Call the readFile() method to read the file
        List<Ticket> ticketList = readerService.readFile(fileName);
        // Print the list
        ticketList.forEach(System.out::println);
        // Call the sortByDistance() method to sort the list based on distance
        dataService.sortByDistance(ticketList);
        // Print the sorted list
        ticketList.forEach(System.out::println);
    }
}
