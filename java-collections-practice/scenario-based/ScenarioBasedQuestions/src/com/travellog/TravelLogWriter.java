package com.travellog;

import java.io.*;
import java.util.List;

public class TravelLogWriter {

    public static void writeTrips(List<Trip> trips, String fileName) throws IOException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(fileName));

        oos.writeObject(trips);
        oos.close();
    }
}

