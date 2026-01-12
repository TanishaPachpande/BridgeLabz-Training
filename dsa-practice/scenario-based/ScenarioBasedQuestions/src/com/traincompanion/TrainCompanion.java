package com.traincompanion;

public class TrainCompanion {

    Compartment head, tail;

    // Add compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newNode = new Compartment(name, pantry, wifi);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Compartment removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Forward traversal
    public void traverseForward() {
        Compartment temp = head;
        System.out.println("Train Forward:");
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Backward traversal
    public void traverseBackward() {
        Compartment temp = tail;
        System.out.println("Train Backward:");
        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " +
                        (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}

