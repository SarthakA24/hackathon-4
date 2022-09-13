package com.jap.ticketing.model;

import java.util.Objects;

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

    public String getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(String scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(int ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public int getTicketFromStopSequenceNumber() {
        return ticketFromStopSequenceNumber;
    }

    public void setTicketFromStopSequenceNumber(int ticketFromStopSequenceNumber) {
        this.ticketFromStopSequenceNumber = ticketFromStopSequenceNumber;
    }

    public int getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(int ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public int getTicketTillStopSequenceNumber() {
        return ticketTillStopSequenceNumber;
    }

    public void setTicketTillStopSequenceNumber(int ticketTillStopSequenceNumber) {
        this.ticketTillStopSequenceNumber = ticketTillStopSequenceNumber;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public double getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public void setTotalTicketAmount(double totalTicketAmount) {
        this.totalTicketAmount = totalTicketAmount;
    }

    public double getTravelledKilometer() {
        return travelledKilometer;
    }

    public void setTravelledKilometer(double travelledKilometer) {
        this.travelledKilometer = travelledKilometer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getTicketFromStopId() == ticket.getTicketFromStopId() && getTicketFromStopSequenceNumber() == ticket.getTicketFromStopSequenceNumber() && getTicketTillStopId() == ticket.getTicketTillStopId() && getTicketTillStopSequenceNumber() == ticket.getTicketTillStopSequenceNumber() && Double.compare(ticket.getTotalTicketAmount(), getTotalTicketAmount()) == 0 && Double.compare(ticket.getTravelledKilometer(), getTravelledKilometer()) == 0 && Objects.equals(getScheduleNumber(), ticket.getScheduleNumber()) && Objects.equals(getRouteNumber(), ticket.getRouteNumber()) && Objects.equals(getTicketDate(), ticket.getTicketDate()) && Objects.equals(getTicketTime(), ticket.getTicketTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScheduleNumber(), getRouteNumber(), getTicketFromStopId(), getTicketFromStopSequenceNumber(), getTicketTillStopId(), getTicketTillStopSequenceNumber(), getTicketDate(), getTicketTime(), getTotalTicketAmount(), getTravelledKilometer());
    }

    @Override
    public String toString() {
        return "Ticket{" + "scheduleNumber='" + scheduleNumber + '\'' + ", routeNumber='" + routeNumber + '\'' + ", ticketFromStopId=" + ticketFromStopId + ", ticketFromStopSequenceNumber=" + ticketFromStopSequenceNumber + ", ticketTillStopId=" + ticketTillStopId + ", ticketTillStopSequenceNumber=" + ticketTillStopSequenceNumber + ", ticketDate='" + ticketDate + '\'' + ", ticketTime='" + ticketTime + '\'' + ", totalTicketAmount=" + totalTicketAmount + ", travelledKilometer=" + travelledKilometer + '}';
    }
}
