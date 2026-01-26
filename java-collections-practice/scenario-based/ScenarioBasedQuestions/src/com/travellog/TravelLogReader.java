package com.travellog;

import java.io.*;
import java.util.List;

public class TravelLogReader {

    public static List<Trip> readTrips(String fileName)
            throws IOException, ClassNotFoundException {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(fileName));

        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();
        return trips;
    }
}
