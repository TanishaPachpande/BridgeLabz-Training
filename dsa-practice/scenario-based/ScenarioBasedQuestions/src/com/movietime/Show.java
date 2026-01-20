package com.movietime;

class Show {
    String movieName;
    int startTime; // Time in minutes (e.g., 10:30 → 630)

    Show(String movieName, int startTime) {
        this.movieName = movieName;
        this.startTime = startTime;
    }
}
