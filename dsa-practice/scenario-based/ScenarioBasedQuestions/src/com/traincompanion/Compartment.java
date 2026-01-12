package com.traincompanion;

public class Compartment {
    String name;
    boolean hasPantry;
    boolean hasWifi;
    Compartment next;
    Compartment prev;

    public Compartment(String name, boolean hasPantry, boolean hasWifi) {
        this.name = name;
        this.hasPantry = hasPantry;
        this.hasWifi = hasWifi;
        this.next = null;
        this.prev = null;
    }
}

