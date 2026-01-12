package com.ambulanceroute;

class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name, boolean available) {
        this.name = name;
        this.available = available;
        this.next = null;
    }
}

