package com.jap.ticketing.model;

public class Ticket {
    private String scheduleNumber;
    private String routeNumber;
    private int ticketFromStopId;
    private int ticketFromStopSequenceNumber;
    private int ticketTillStopId;
    private int ticketTillStopSequenceNumber;
    private String ticketDate;
    private String ticketTime;
    private double totalTicketAmount;
    private double travelledKilometer;

    public Ticket() {
    }

    public Ticket(String scheduleNumber, String routeNumber, int ticketFromStopId, int ticketFromStopSequenceNumber, int ticketTillStopId, int ticketTillStopSequenceNumber, String ticketDate, String ticketTime, double totalTicketAmount, double travelledKilometer) {
        this.scheduleNumber = scheduleNumber;
        this.routeNumber = routeNumber;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSequenceNumber = ticketFromStopSequenceNumber;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSequenceNumber = ticketTillStopSequenceNumber;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKilometer = travelledKilometer;
    }
}
