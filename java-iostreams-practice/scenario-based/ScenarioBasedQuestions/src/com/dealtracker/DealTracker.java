package com.dealtracker;


import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealTracker {

    private static final Pattern DEAL_CODE_PATTERN =
            Pattern.compile("DealCode:\\s*(\\w+)");
    private static final Pattern DATE_PATTERN =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT_PATTERN =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN_PURCHASE_PATTERN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        String fileName = "deals.txt";

        Map<String, Deal<Integer>> dealMap = new HashMap<>();
        Set<String> dealCodeSet = new HashSet<>();

        readDeals(fileName, dealMap, dealCodeSet);

        sortDealsByDiscount(dealMap);
    }

    // ---------- Read Deals using FileInputStream ----------

    private static void readDeals(String fileName,
                                  Map<String, Deal<Integer>> dealMap,
                                  Set<String> dealCodeSet) {

        try (FileInputStream fis = new FileInputStream(fileName)) {

            String content = new String(fis.readAllBytes());
            String[] blocks = content.split("\\n\\n");

            for (String block : blocks) {

                String dealCode = extract(DEAL_CODE_PATTERN, block);
                String dateStr = extract(DATE_PATTERN, block);
                String discountStr = extract(DISCOUNT_PATTERN, block);
                String minPurchaseStr = extract(MIN_PURCHASE_PATTERN, block);

                if (dealCode == null || dateStr == null ||
                        discountStr == null || minPurchaseStr == null) {
                    continue;
                }

                if (dealCodeSet.contains(dealCode)) {
                    continue;
                }

                LocalDate validTill = LocalDate.parse(dateStr, FORMATTER);

                if (validTill.isBefore(LocalDate.now())) {
                    continue;
                }

                int discount = Integer.parseInt(discountStr);
                int minPurchase = Integer.parseInt(minPurchaseStr);

                Deal<Integer> deal =
                        new Deal<>(dealCode, validTill, discount, minPurchase);

                dealMap.put(dealCode, deal);
                dealCodeSet.add(dealCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- Helper Regex Extract ----------

    private static String extract(Pattern pattern, String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group(1) : null;
    }

    // ---------- Sort Deals Using Comparator ----------

    private static void sortDealsByDiscount(
            Map<String, Deal<Integer>> dealMap) {

        System.out.println("\n===== Valid Deals Sorted by Discount =====");

        List<Deal<Integer>> dealList =
                new ArrayList<>(dealMap.values());

        dealList.sort(Comparator.comparing(
                d -> (Integer) d.getBenefit(),
                Comparator.reverseOrder()
        ));

        dealList.forEach(System.out::println);
    }
}

