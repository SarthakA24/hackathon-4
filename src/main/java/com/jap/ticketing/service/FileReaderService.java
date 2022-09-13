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
            bufferedReader.readLine();
            bufferedReader.lines().map(readLine -> readLine.split(",")).forEach(data -> {
                Ticket ticket = new Ticket();
                ticket.setScheduleNumber(data[0].trim());
                ticket.setRouteNumber(data[1].trim());
                ticket.setTicketFromStopId(Integer.parseInt(data[2]));
                ticket.setTicketFromStopSequenceNumber(Integer.parseInt(data[3]));
                ticket.setTicketTillStopId(Integer.parseInt(data[4]));
                ticket.setTicketTillStopSequenceNumber(Integer.parseInt(data[5]));
                ticket.setTicketDate(data[6].trim());
                ticket.setTicketTime(data[7].trim());
                ticket.setTotalTicketAmount(Double.parseDouble(data[8]));
                ticket.setTravelledKilometer(Double.parseDouble(data[9]));
                ticketList.add(ticket);
            });
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return ticketList;
    }
}
