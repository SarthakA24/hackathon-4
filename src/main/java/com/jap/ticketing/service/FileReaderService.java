package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

    /**
     * This method reads the CSV file data into a List of Tickets
     *
     * @param fileName The file path which need to be read
     * @return The List of Tickets containing the data from the file
     */
    public List<Ticket> readFile(String fileName) {
        List<Ticket> ticketList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String header = bufferedReader.readLine();
            bufferedReader.lines().map(readLine -> readLine.split(",")).forEach(data -> {
                String scheduleNumber = data[0].trim();
                String routeNumber = data[1].trim();
                int ticketFromStopId = Integer.parseInt(data[2]);
                int ticketFromStopSequenceNumber = Integer.parseInt(data[3]);
                int ticketTillStopId = Integer.parseInt(data[4]);
                int ticketTillStopSequenceNumber = Integer.parseInt(data[5]);
                String ticketDate = data[6].trim();
                String ticketTime = data[7].trim();
                double totalTicketAmount = Double.parseDouble(data[8]);
                double travelledKilometer = Double.parseDouble(data[9]);
                Ticket ticket = new Ticket(scheduleNumber, routeNumber, ticketFromStopId, ticketFromStopSequenceNumber, ticketTillStopId, ticketTillStopSequenceNumber, ticketDate, ticketTime, totalTicketAmount, travelledKilometer);
                ticketList.add(ticket);
            });
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return ticketList;
    }
}
