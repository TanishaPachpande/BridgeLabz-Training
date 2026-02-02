package com.functionalinterfaces;

interface Backupable {
 // no methods
}

class UserData implements Backupable {
 String name;
 int id;

 UserData(String name, int id) {
     this.name = name;
     this.id = id;
 }
}

class SessionData {
 String sessionId;

 SessionData(String sessionId) {
     this.sessionId = sessionId;
 }
}

class BackupService {

 static void backup(Object obj) {
     if (obj instanceof Backupable) {
         System.out.println("Backing up: " + obj.getClass().getSimpleName());
     } else {
         System.out.println("Backup NOT allowed for: " + obj.getClass().getSimpleName());
     }
 }
}

public class DataSerializationForBackup {

 public static void main(String[] args) {

     UserData user = new UserData("Tanisha", 101);
     SessionData session = new SessionData("ABC123");

     BackupService.backup(user);
     BackupService.backup(session);
 }
}

