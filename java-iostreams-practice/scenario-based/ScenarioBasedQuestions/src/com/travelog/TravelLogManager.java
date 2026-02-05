package com.travelog;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TravelLogManager {

    private static final String FILE_NAME = "trips.dat";

    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        // Sample trips
        trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower and cafes"));
        trips.add(new Trip("Rome", "Italy", 4, "Colosseum and Vatican"));
        trips.add(new Trip("Paris", "France", 6, "Museums and art galleries"));
        trips.add(new Trip("Berlin", "Germany", 8, "History and nightlife"));
        trips.add(new Trip("Rome", "Italy", 10, "Food and culture"));

        writeTripsToFile(trips);

        List<Trip> readTrips = readTripsFromFile();

        findCitiesUsingRegex(readTrips);
        findLongTrips(readTrips);
        findUniqueCountries(readTrips);
        findTopVisitedCities(readTrips);
    }

    // -------- Serialization --------

    private static void writeTripsToFile(List<Trip> trips) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(trips);
            System.out.println("Trips saved successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static List<Trip> readTripsFromFile() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Trip>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    // -------- Regex Search --------

    private static void findCitiesUsingRegex(List<Trip> trips) {
        System.out.println("\nCities found using regex:");

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+\\b");

        for (Trip trip : trips) {
            Matcher matcher = pattern.matcher(trip.getDescription());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }

    // -------- Filter Trips > 5 Days --------

    private static void findLongTrips(List<Trip> trips) {
        System.out.println("\nTrips longer than 5 days:");

        for (Trip trip : trips) {
            if (trip.getDurationInDays() > 5) {
                System.out.println(trip);
            }
        }
    }

    // -------- Unique Countries (Set) --------

    private static void findUniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();

        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }

        System.out.println("\nUnique countries visited:");
        for (String country : countries) {
            System.out.println(country);
        }
    }

    // -------- Top 3 Cities (Map + Sorting) --------

    private static void findTopVisitedCities(List<Trip> trips) {
        Map<String, Integer> cityCountMap = new HashMap<>();

        for (Trip trip : trips) {
            cityCountMap.put(
                trip.getCity(),
                cityCountMap.getOrDefault(trip.getCity(), 0) + 1
            );
        }

        List<Map.Entry<String, Integer>> cityList =
                new ArrayList<>(cityCountMap.entrySet());

        cityList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nTop 3 most visited cities:");
        for (int i = 0; i < Math.min(3, cityList.size()); i++) {
            System.out.println(
                cityList.get(i).getKey() + " -> " + cityList.get(i).getValue() + " visits"
            );
        }
    }
}
