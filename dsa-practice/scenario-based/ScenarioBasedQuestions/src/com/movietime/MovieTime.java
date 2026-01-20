package com.movietime;

public class MovieTime {

    public static void insertionSort(Show[] shows) {
        int n = shows.length;

        for (int i = 1; i < n; i++) {
            Show key = shows[i];
            int j = i - 1;

            // Shift shows that start later than key
            while (j >= 0 && shows[j].startTime > key.startTime) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Show[] shows = {
            new Show("Avengers", 600),   // 10:00
            new Show("Inception", 750),  // 12:30
            new Show("Joker", 900),      // 15:00
            new Show("Batman", 1080)     // 18:00
        };

        // New show added
        Show newShow = new Show("Interstellar", 825); // 13:45
        Show[] updatedShows = new Show[shows.length + 1];

        System.arraycopy(shows, 0, updatedShows, 0, shows.length);
        updatedShows[shows.length] = newShow;

        insertionSort(updatedShows);

        System.out.println("Upcoming Shows:");
        for (Show s : updatedShows) {
            System.out.println(s.movieName + " - " + (s.startTime / 60) + ":" +
                               String.format("%02d", s.startTime % 60));
        }
    }
}

