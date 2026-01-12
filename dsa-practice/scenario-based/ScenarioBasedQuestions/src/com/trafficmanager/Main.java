package com.trafficmanager;

public class Main {
    public static void main(String[] args) {
        RoundAbout roundabout = new RoundAbout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue("MH12A1234");
        queue.enqueue("MH12B5678");
        queue.enqueue("MH12C9999");
        queue.enqueue("MH12D8888"); // Overflow

        String vehicle;
        vehicle = queue.dequeue();
        if (vehicle != null) roundabout.addVehicle(vehicle);

        vehicle = queue.dequeue();
        if (vehicle != null) roundabout.addVehicle(vehicle);

        roundabout.printRoundabout();

        roundabout.removeVehicle();
        roundabout.printRoundabout();
    }
}

