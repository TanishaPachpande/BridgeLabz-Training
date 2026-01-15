package com.parceltracker;

public class ParcelTracker {

    private StageNode head;

    // Initialize default delivery stages
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Forward tracking
    public void trackParcel() {
        StageNode temp = head;

        System.out.println("\nParcel Tracking:");
        while (temp != null) {
            System.out.println("→ " + temp.stageName);
            temp = temp.next;
        }
    }

    // Add intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase(afterStage)) {
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;
                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found.");
    }

    // Handle lost parcel
    public void checkParcelStatus() {
        StageNode temp = head;

        while (temp != null) {
            if (temp.next == null && !temp.stageName.equals("Delivered")) {
                System.out.println("\n⚠ Parcel LOST after stage: " + temp.stageName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("\n✔ Parcel delivered successfully.");
    }
}

