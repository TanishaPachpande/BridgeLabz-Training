package com.songvault;

public abstract class Media {
    protected String title;
    protected String artist;
    protected String duration;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }
}

