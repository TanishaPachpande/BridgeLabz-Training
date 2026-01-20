package com.cropmonitor;

class SensorData {
    long timestamp;
    double temperature;

    SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}

