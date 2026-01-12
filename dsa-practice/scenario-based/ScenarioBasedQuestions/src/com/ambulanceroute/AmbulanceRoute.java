package com.ambulanceroute;

class AmbulanceRoute {
    private HospitalUnit head = null;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
    }

    // Find nearest available unit
    public void routePatient() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Patient sent to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units busy! Patient redirected");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null)
            return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(unitName)) {
                // Single node case
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    HospitalUnit temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                }
                // Removing middle node
                else {
                    prev.next = curr.next;
                }
                System.out.println(unitName + " is under maintenance and removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display route
    public void displayUnits() {
        if (head == null) {
            System.out.println("No units in route");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Emergency)");
    }
}

