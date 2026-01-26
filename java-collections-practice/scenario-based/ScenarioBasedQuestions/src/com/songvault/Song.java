package com.songvault;

public class Song extends Media {

    private String genre;

    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " | " + artist + " | " + duration + " | " + genre;
    }
}
