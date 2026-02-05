package com.travelog;


import java.io.Serializable;

public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    private String city;
    private String country;
    private int durationInDays;
    private String description;

    public Trip(String city, String country, int durationInDays, String description) {
        this.city = city;
        this.country = country;
        this.durationInDays = durationInDays;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "City: " + city +
               ", Country: " + country +
               ", Duration: " + durationInDays + " days";
    }
}
