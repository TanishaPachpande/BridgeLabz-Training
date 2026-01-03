package com.linkedlist.singlelinkedlist.SocialMediaFriendConnections;


class SocialMediaSystem {
    private UserNode head;

    // Add user
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search user by ID
    public UserNode searchById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by Name
    public UserNode searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bi-directional)
    public void addFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found!");
            return;
        }

        user1.friends = addFriend(user1.friends, id2);
        user2.friends = addFriend(user2.friends, id1);
        System.out.println("Friend connection added.");
    }

    private FriendNode addFriend(FriendNode head, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = head;
        return newFriend;
    }

    // Remove friend connection
    public void removeFriendConnection(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found!");
            return;
        }

        user1.friends = removeFriend(user1.friends, id2);
        user2.friends = removeFriend(user2.friends, id1);
        System.out.println("Friend connection removed.");
    }

    private FriendNode removeFriend(FriendNode head, int friendId) {
        if (head == null) return null;

        if (head.friendId == friendId)
            return head.next;

        FriendNode curr = head;
        while (curr.next != null) {
            if (curr.next.friendId == friendId) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = user1.friends;

        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Count friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}
