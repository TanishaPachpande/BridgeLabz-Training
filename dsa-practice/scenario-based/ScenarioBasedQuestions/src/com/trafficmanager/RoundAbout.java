package com.trafficmanager;

class RoundAbout {
    private Vehicle head = null;

    // Add vehicle to roundabout
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println("Vehicle " + number + " entered the roundabout.");
    }

    // Remove vehicle from roundabout
    public void removeVehicle() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        if (head.next == head) {
            System.out.println("Vehicle " + head.vehicleNumber + " exited.");
            head = null;
            return;
        }

        Vehicle temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        System.out.println("Vehicle " + temp.next.vehicleNumber + " exited.");
        temp.next = head;
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
