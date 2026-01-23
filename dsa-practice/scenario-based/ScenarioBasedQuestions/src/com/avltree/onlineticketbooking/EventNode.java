package com.avltree.onlineticketbooking;

class EventNode {
    int startTime;
    String eventName;
    int height;
    EventNode left, right;

    EventNode(String eventName, int startTime) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.height = 1;
    }
}

