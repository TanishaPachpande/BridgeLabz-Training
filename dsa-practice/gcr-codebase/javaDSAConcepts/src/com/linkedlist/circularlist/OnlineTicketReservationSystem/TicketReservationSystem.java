package com.linkedlist.circularlist.OnlineTicketReservationSystem;

class TicketReservationSystem {
    private TicketNode tail;

    // Add new ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

        if (tail == null) {
            tail = newTicket;
            tail.next = tail;
        } else {
            newTicket.next = tail.next;
            tail.next = newTicket;
            tail = newTicket;
        }
        System.out.println("Ticket booked successfully.");
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (tail == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = tail.next;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {
                if (curr == tail && curr.next == tail) {
                    tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == tail)
                        tail = prev;
                }
                System.out.println("Ticket cancelled.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = tail.next;
        System.out.println("Current Booked Tickets:");

        do {
            System.out.println(
                "Ticket ID: " + temp.ticketId +
                ", Customer: " + temp.customerName +
                ", Movie: " + temp.movieName +
                ", Seat: " + temp.seatNumber +
                ", Time: " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != tail.next);
    }

    // Search by customer or movie
    public void searchTicket(String keyword) {
        if (tail == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = tail.next;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) ||
                temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println(
                    "Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != tail.next);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    // Count total tickets
    public int countTickets() {
        if (tail == null) return 0;

        int count = 0;
        TicketNode temp = tail.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != tail.next);

        return count;
    }
}

