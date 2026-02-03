package com.workshop.smartcity.main;

import java.util.*;
import java.util.stream.*;

import com.workshop.smartcity.interfaces.*;
import com.workshop.smartcity.services.*;

public class SmartCityApp {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
            new BusService("A-B", 30, 540, 40),
            new MetroService("A-C", 20, 510, 80),
            new TaxiService("B-C", 50, 600, 2)
        );

        // 1. Lambda: Filter & Sort
        System.out.println("Filtered & Sorted Services:");
        services.stream()
                .filter(s -> s.getFare() <= 30)
                .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        // 2. Dashboard Update
        System.out.println("\nLive Dashboard:");
        services.forEach(s ->
            System.out.println("Active: " + s.getServiceName())
        );

        // 3. Revenue Report
        DoubleSummaryStatistics revenueStats =
            services.stream()
                    .collect(Collectors.summarizingDouble(
                        s -> s.getFare() * s.getPassengerCount()
                    ));

        System.out.println("\nRevenue Summary:");
        System.out.println("Total: " + revenueStats.getSum());
        System.out.println("Average: " + revenueStats.getAverage());

        // 4. Grouping by Route
        Map<String, List<TransportService>> byRoute =
            services.stream()
                    .collect(Collectors.groupingBy(TransportService::getRoute));

        // 5. Emergency Detection
        System.out.println("\nEmergency Check:");
        services.forEach(s -> {
            if (s instanceof EmergencyService) {
                System.out.println("Priority given to: " + s.getServiceName());
            }
        });

        // 6. Functional Interface (Fare Calculator)
        FareCalculator busFareCalc = d -> d * 5;
        System.out.println("\nCalculated Bus Fare: " + busFareCalc.calculateFare(10));
    }
}
