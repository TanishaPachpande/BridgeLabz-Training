package com.functionalinterfaces;

class Employee implements Cloneable {

 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 @Override
 protected Object clone() throws CloneNotSupportedException {
     return super.clone();   // shallow copy
 }

 void display() {
     System.out.println(id + " | " + name + " | " + salary);
 }
}

public class CloningPrototypeObjects {

 public static void main(String[] args) {

     try {
         Employee emp1 = new Employee(101, "Tanisha", 50000);
         emp1.display();

         Employee emp2 = (Employee) emp1.clone();
         emp2.display();

     } catch (CloneNotSupportedException e) {
         System.out.println("Cloning not allowed");
     }
 }
}
