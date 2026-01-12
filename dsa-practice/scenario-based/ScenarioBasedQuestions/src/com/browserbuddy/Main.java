package com.browserbuddy;

public class Main {
    public static void main(String[] args) {

        BrowserManager manager = new BrowserManager();

        manager.openNewTab("google.com");
        BrowserTab tab = manager.getActiveTab();

        tab.visit("youtube.com");
        tab.visit("github.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeCurrentTab();
        manager.reopenClosedTab();
    }
}

