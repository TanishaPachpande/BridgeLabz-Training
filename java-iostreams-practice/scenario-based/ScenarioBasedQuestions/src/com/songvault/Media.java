package com.songvault;

public class Media<T> {

    protected T title;
    protected String artist;
    protected String duration;
    protected String genre;

    public Media(T title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public T getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }
}

