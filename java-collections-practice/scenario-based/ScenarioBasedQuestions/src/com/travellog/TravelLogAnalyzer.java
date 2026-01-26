package com.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelLogAnalyzer {

    public static void main(String[] args) throws Exception {

        List<Trip> trips = List.of(
                new Trip("Paris", "France", 7, "Visited Eiffel Tower and cafes"),
                new Trip("Rome", "Italy", 4, "Colosseum and Vatican city tour"),
                new Trip("Paris", "France", 6, "Museums and food exploration"),
                new Trip("Berlin", "Germany", 3, "Street art and nightlife"),
                new Trip("Rome", "Italy", 8, "History, food, and culture")
        );

        TravelLogWriter.writeTrips(trips, "trips.ser");

        List<Trip> loadedTrips = TravelLogReader.readTrips("trips.ser");

        findCitiesUsingRegex(loadedTrips);
        findLongTrips(loadedTrips);
        findUniqueCountries(loadedTrips);
        findTop3Cities(loadedTrips);
    }

    private static void findCitiesUsingRegex(List<Trip> trips) {
        Pattern pattern = Pattern.compile("\\b(Paris|Rome|Berlin)\\b");

        System.out.println("\nCities mentioned in experiences:");
        for (Trip trip : trips) {
            Matcher matcher = pattern.matcher(trip.getExperience());
            if (matcher.find()) {
                System.out.println(trip.getCity());
            }
        }
    }

    private static void findLongTrips(List<Trip> trips) {
        System.out.println("\nTrips longer than 5 days:");
        trips.stream()
                .filter(t -> t.getDurationDays() > 5)
                .forEach(System.out::println);
    }

    private static void findUniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();
        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }
        System.out.println("\nUnique countries visited:");
        countries.forEach(System.out::println);
    }

    private static void findTop3Cities(List<Trip> trips) {

        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip trip : trips) {
            cityCount.put(trip.getCity(),
                    cityCount.getOrDefault(trip.getCity(), 0) + 1);
        }

        System.out.println("\nTop 3 most visited cities:");
        cityCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " → " + e.getValue() + " visits"));
    }
}

