package com.jap.ticketing;

import com.jap.ticketing.model.Ticket;
import com.jap.ticketing.service.DataService;
import com.jap.ticketing.service.FileReaderService;

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
        System.out.println("--------------------");
        System.out.println("Ticket Data Read from the File - ");
        System.out.println("--------------------");
        ticketList.forEach(System.out::println);
        // Call the sortByDistance() method to sort the list based on distance
        List<Ticket> sortedTicketList = dataService.sortByDistance(ticketList);
        // Print the sorted list
        System.out.println("--------------------");
        System.out.println("Tickets Data sorted based on Distance Travelled - ");
        System.out.println("--------------------");
        sortedTicketList.forEach(System.out::println);
        System.out.println("--------------------");
        // Call the method find the total collection made by ticket sales
        double collectionMadeByTicketSales = dataService.totalCollectionMadeByTicketSales(ticketList);
        // Print the total collection made by the ticket sales
        System.out.println("Total Collection made by the Ticket Sales is  $" + collectionMadeByTicketSales);
        System.out.println("--------------------");
    }
}
