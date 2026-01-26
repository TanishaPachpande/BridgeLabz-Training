package com.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class MedInventory<T> {

    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    private static final int CRITICAL_LIMIT = 10;

    private Map<String, List<InventoryItem<T>>> categorizedItems = new HashMap<>();
    private Set<InventoryItem<T>> uniqueItems = new HashSet<>();

    private DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public void processFile(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    InventoryItem<T> item = parseLine(line);
                    uniqueItems.add(item);
                    categorizeItem(item);
                    checkCriticalStock(item);
                } catch (LowStockException e) {
                    System.out.println("CRITICAL ALERT: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Invalid entry skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading inventory file");
        }
    }

    private InventoryItem<T> parseLine(String line) {

        String[] tokens = line.split(",");

        String itemId = tokens[0];
        T itemType = (T) tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        String expiry = tokens[3];

        if (!DATE_PATTERN.matcher(expiry).matches()) {
            throw new IllegalArgumentException("Invalid date format");
        }

        LocalDate expiryDate = LocalDate.parse(expiry, formatter);

        return new InventoryItem<>(itemId, itemType, quantity, expiryDate);
    }

    private void categorizeItem(InventoryItem<T> item) {

        categorizedItems
                .computeIfAbsent(item.getItemType().toString(), k -> new ArrayList<>())
                .add(item);
    }

    private void checkCriticalStock(InventoryItem<T> item) throws LowStockException {

        if (item.getQuantity() < CRITICAL_LIMIT) {
            throw new LowStockException(
                    item.getItemType() + " stock critically low: " + item.getQuantity());
        }
    }

    public void printExpiredItems() {

        System.out.println("\nExpired Items:");
        uniqueItems.stream()
                .filter(InventoryItem::isExpired)
                .forEach(System.out::println);
    }

    public void printCategorySummary() {

        System.out.println("\nInventory by Category:");
        categorizedItems.forEach((type, items) -> {
            System.out.println(type + " → " + items.size() + " items");
        });
    }
}

