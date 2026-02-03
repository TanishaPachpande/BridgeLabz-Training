package com.workshop.smartcity.interfaces;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime();
    int getPassengerCount();

    default void printServiceDetails() {
        System.out.println(
            getServiceName() + " | Route: " + getRoute() +
            " | Fare: " + getFare() +
            " | Departure: " + getDepartureTime()
        );
    }
}
