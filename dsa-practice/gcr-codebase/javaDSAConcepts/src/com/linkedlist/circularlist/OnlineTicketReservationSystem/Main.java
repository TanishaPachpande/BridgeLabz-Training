package com.linkedlist.circularlist.OnlineTicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Tanisha", "Inception", "A1", "10:30 AM");
        system.addTicket(102, "Amit", "Avatar", "B2", "1:00 PM");
        system.addTicket(103, "Riya", "Inception", "C3", "6:00 PM");

        system.displayTickets();

        system.searchTicket("Inception");

        System.out.println("Total Tickets: " + system.countTickets());

        system.removeTicket(102);
        system.displayTickets();
    }
}

