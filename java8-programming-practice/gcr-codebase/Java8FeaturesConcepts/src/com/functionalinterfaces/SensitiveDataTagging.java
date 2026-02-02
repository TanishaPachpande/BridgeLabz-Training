package com.functionalinterfaces;


interface Encryptable {
}

class UserCredentials implements Encryptable {
 String username;
 String password;

 UserCredentials(String username, String password) {
     this.username = username;
     this.password = password;
 }
}

class Product {
 String productName;
 double price;

 Product(String productName, double price) {
     this.productName = productName;
     this.price = price;
 }
}

class EncryptionService {

 static void processEncryption(Object obj) {

     if (obj instanceof Encryptable) {
         System.out.println("Encrypting data for: " + obj.getClass().getSimpleName());
     } else {
         System.out.println("No encryption required for: " + obj.getClass().getSimpleName());
     }
 }
}

public class SensitiveDataTagging {

 public static void main(String[] args) {

     UserCredentials user = new UserCredentials("admin", "secret123");
     Product product = new Product("Laptop", 75000);

     EncryptionService.processEncryption(user);
     EncryptionService.processEncryption(product);
 }
}

