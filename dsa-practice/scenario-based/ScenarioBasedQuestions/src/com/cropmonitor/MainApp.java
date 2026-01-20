package com.cropmonitor;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        ArrayList<SensorData> sensorReadings = new ArrayList<>();

        sensorReadings.add(new SensorData(1705203000L, 29.4));
        sensorReadings.add(new SensorData(1705201000L, 28.1));
        sensorReadings.add(new SensorData(1705205000L, 30.0));
        sensorReadings.add(new SensorData(1705202000L, 28.7));

        CropMonitor.quickSort(sensorReadings, 0, sensorReadings.size() - 1);

        System.out.println("Sorted Sensor Data (by Timestamp):");
        for (SensorData s : sensorReadings) {
            System.out.println("Time: " + s.timestamp + " Temp: " + s.temperature);
        }
    }
}

