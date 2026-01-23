package com.avltree.onlineticketbooking;

public class Main {
    public static void main(String[] args) {

        EventAVL events = new EventAVL();

        // 🔹 Scenario 1: Insert Events
        events.root = events.insert(events.root, "Music Concert", 1800);
        events.root = events.insert(events.root, "Tech Conference", 1000);
        events.root = events.insert(events.root, "Comedy Show", 1500);
        events.root = events.insert(events.root, "Movie Premiere", 2000);
        events.root = events.insert(events.root, "Art Exhibition", 1200);

        // 🔹 Scenario 3: Show Upcoming Events
        System.out.println("🎟 Upcoming Events:");
        events.inorder(events.root);

        // 🔹 Scenario 2: Cancel Event
        System.out.println("\nCancelling event at time 1500");
        events.root = events.delete(events.root, 1500);

        System.out.println("\nUpdated Event List:");
        events.inorder(events.root);
    }
}

