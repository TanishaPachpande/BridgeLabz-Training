package com.workshop.smartcity.services;

import com.workshop.smartcity.interfaces.TransportService;

public class MetroService implements TransportService {

    private String route;
    private double fare;
    private int departureTime;
    private int passengers;

    public MetroService(String route, double fare, int departureTime, int passengers) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
        this.passengers = passengers;
    }

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public int getDepartureTime() { return departureTime; }
    public int getPassengerCount() { return passengers; }
}

