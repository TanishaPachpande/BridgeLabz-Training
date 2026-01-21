package com.collections.queueinterface;

import java.util.PriorityQueue;

//Patient class
class Patient {
 String name;
 int severity;

 public Patient(String name, int severity) {
     this.name = name;
     this.severity = severity;
 }
}

public class HospitalTriageSystem {
 public static void main(String[] args) {

     // PriorityQueue: higher severity first
     PriorityQueue<Patient> queue = new PriorityQueue<>(
         (p1, p2) -> p2.severity - p1.severity
     );

     // Adding patients
     queue.add(new Patient("John", 3));
     queue.add(new Patient("Alice", 5));
     queue.add(new Patient("Bob", 2));

     System.out.print("Treatment Order: ");

     // Treat patients
     while (!queue.isEmpty()) {
         Patient p = queue.poll();
         System.out.print(p.name + " ");
     }
 }
}
