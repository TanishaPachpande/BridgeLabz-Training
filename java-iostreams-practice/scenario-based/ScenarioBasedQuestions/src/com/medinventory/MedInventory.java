package com.medinventory;


import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class MedInventory {

    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        String fileName = "inventory.csv";

        Set<Item<?>> uniqueItems = new HashSet<>();
        Map<String, List<Item<?>>> categorizedItems = new HashMap<>();

        categorizedItems.put("Medicine", new ArrayList<>());
        categorizedItems.put("Equipment", new ArrayList<>());

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    Item<?> item = parseLine(line);

                    uniqueItems.add(item);
                    categorizedItems.get("Medicine").add(item);

                    checkLowStock(item);

                    if (isExpired(item)) {
                        System.out.println("Expired Item Found: " + item);
                    }

                } catch (LowStockException e) {
                    System.out.println("ALERT: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Invalid row skipped: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        printSummary(categorizedItems, uniqueItems);
    }

    // -------- Parse CSV Line --------

    private static Item<?> parseLine(String line) {

        String[] data = line.split(",");

        String id = data[0];
        String name = data[1];
        int qty = Integer.parseInt(data[2]);
        String expiry = data[3];

        if (!DATE_PATTERN.matcher(expiry).matches()) {
            throw new RuntimeException("Invalid date format");
        }

        return new Medicine(id, name, qty, expiry);
    }

    // -------- Expiry Check --------

    private static boolean isExpired(Item<?> item) {
        LocalDate expiry =
                LocalDate.parse(item.getExpiryDate(), FORMATTER);
        return expiry.isBefore(LocalDate.now());
    }

    // -------- Low Stock Check --------

    private static void checkLowStock(Item<?> item)
            throws LowStockException {

        if (item.getQuantity() < 10) {
            throw new LowStockException(
                    "Critical low stock for item: " + item.getItemName()
            );
        }
    }

    // -------- Print Summary --------

    private static void printSummary(Map<String, List<Item<?>>> categorizedItems,
                                     Set<Item<?>> uniqueItems) {

        System.out.println("\n===== Inventory Summary =====");

        System.out.println("\nUnique Items Count: " + uniqueItems.size());

        for (Map.Entry<String, List<Item<?>>> entry : categorizedItems.entrySet()) {
            System.out.println("\nCategory: " + entry.getKey());
            for (Item<?> item : entry.getValue()) {
                System.out.println(item);
            }
        }
    }
}

