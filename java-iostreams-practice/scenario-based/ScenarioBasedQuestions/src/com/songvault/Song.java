package com.songvault;


public class Song extends Media<String> {

    public Song(String title, String artist, String duration, String genre) {
        super(title, artist, duration, genre);
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Artist: " + artist +
               ", Duration: " + duration +
               ", Genre: " + genre;
    }
}

