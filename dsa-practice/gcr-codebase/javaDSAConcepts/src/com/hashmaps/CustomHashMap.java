package com.hashmaps;

import java.util.LinkedList;

public class CustomHashMap<K, V> {

    // Node class for linked list
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16; // default capacity
    private LinkedList<Node<K, V>>[] table;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % capacity);
    }

    // PUT operation
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                node.value = value; // update existing
                System.out.println("Updated key: " + key + " with value: " + value);
                return;
            }
        }

        bucket.add(new Node<>(key, value));
        System.out.println("Inserted key: " + key + " with value: " + value);
    }

    // GET operation
    public V get(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                return node.value;
            }
        }

        return null; // not found
    }

    // REMOVE operation
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if ((key == null && node.key == null) || (key != null && key.equals(node.key))) {
                bucket.remove(node);
                System.out.println("Removed key: " + key);
                return;
            }
        }

        System.out.println("Key not found: " + key);
    }

    // Main method (Test)
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("\nValue for 'Apple': " + map.get("Apple"));
        System.out.println("Value for 'Grapes': " + map.get("Grapes"));

        map.put("Apple", 60); // update
        System.out.println("\nValue for 'Apple' after update: " + map.get("Apple"));

        map.remove("Banana");
        System.out.println("Value for 'Banana' after removal: " + map.get("Banana"));

        map.remove("Grapes"); // non-existing
    }
}
