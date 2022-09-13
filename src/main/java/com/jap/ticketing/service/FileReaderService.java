package com.jap.ticketing.service;

import com.jap.ticketing.model.Ticket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {

    public List<Ticket> readFile (String fileName) {
        List<Ticket> ticketList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return ticketList;
    }
}
