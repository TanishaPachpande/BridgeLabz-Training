package com.browserbuddy;

class BrowserTab {
    private PageNode current;

    public BrowserTab(String homepage) {
        current = new PageNode(homepage);
    }

    // Visit new page
    public void visit(String url) {
        PageNode newPage = new PageNode(url);
        current.next = newPage;
        newPage.prev = current;
        current = newPage;
        System.out.println("Visited: " + url);
    }

    // Back operation
    public void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    // Forward operation
    public void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    public String getCurrentPage() {
        return current.url;
    }
}

