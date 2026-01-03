package com.linkedlist.singlelinkedlist.SocialMediaFriendConnections;

import java.util.Scanner;

import com.linkedlist.singlelinkedlist.StudentRecordManagement.StudentLinkedList;

public class Main {
    public static void main(String[] args) {
        SocialMediaSystem sm = new SocialMediaSystem();

        sm.addUser(1, "Tanisha", 21);
        sm.addUser(2, "Amit", 22);
        sm.addUser(3, "Riya", 20);
        sm.addUser(4, "Neha", 23);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.countFriends();

        sm.removeFriendConnection(1, 3);
        sm.displayFriends(1);
    }
}
