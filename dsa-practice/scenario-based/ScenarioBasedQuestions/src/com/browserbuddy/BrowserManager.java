package com.browserbuddy;

import java.util.Stack;

class BrowserManager {
    private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab activeTab;

    public void openNewTab(String homepage) {
        activeTab = new BrowserTab(homepage);
        System.out.println("New tab opened: " + homepage);
    }

    public void closeCurrentTab() {
        if (activeTab != null) {
            closedTabs.push(activeTab);
            System.out.println("Tab closed");
            activeTab = null;
        }
    }

    public void reopenClosedTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Reopened tab at: " + activeTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore");
        }
    }

    public BrowserTab getActiveTab() {
        return activeTab;
    }
}

