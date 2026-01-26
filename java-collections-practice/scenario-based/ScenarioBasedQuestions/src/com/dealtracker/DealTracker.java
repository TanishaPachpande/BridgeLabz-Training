package com.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealTracker<T> {

    private static final Pattern DEAL_CODE =
            Pattern.compile("DealCode: (\\w+)");
    private static final Pattern VALID_TILL =
            Pattern.compile("ValidTill: (\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT =
            Pattern.compile("Discount: (\\d+)%");
    private static final Pattern MIN_PURCHASE =
            Pattern.compile("MinimumPurchase: (\\d+)");

    private Map<String, Deal<T>> validDeals = new HashMap<>();
    private Set<String> dealCodes = new HashSet<>();

    public void processFile(String filePath, T promotionType) {

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(
                             new FileInputStream(filePath)))) {

            String line;
            String block = "";

            while ((line = br.readLine()) != null) {

                if (line.isEmpty()) {
                    processDealBlock(block, promotionType);
                    block = "";
                } else {
                    block += line + "\n";
                }
            }

            if (!block.isEmpty()) {
                processDealBlock(block, promotionType);
            }

        } catch (IOException e) {
            System.out.println("Error reading deal file");
        }

        printSortedDeals();
    }

    private void processDealBlock(String block, T promotionType) {

        Matcher codeMatcher = DEAL_CODE.matcher(block);
        Matcher dateMatcher = VALID_TILL.matcher(block);
        Matcher discountMatcher = DISCOUNT.matcher(block);
        Matcher minMatcher = MIN_PURCHASE.matcher(block);

        if (codeMatcher.find() && dateMatcher.find()
                && discountMatcher.find() && minMatcher.find()) {

            String code = codeMatcher.group(1);

            if (!dealCodes.add(code)) {
                return; // duplicate deal
            }

            LocalDate validTill = LocalDate.parse(
                    dateMatcher.group(1),
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            if (validTill.isBefore(LocalDate.now())) {
                return; // expired deal
            }

            int discount = Integer.parseInt(discountMatcher.group(1));
            int minPurchase = Integer.parseInt(minMatcher.group(1));

            Deal<T> deal = new Deal<>(code, validTill,
                    discount, minPurchase, promotionType);

            validDeals.put(code, deal);
        }
    }

    private void printSortedDeals() {

        List<Deal<T>> deals =
                new ArrayList<>(validDeals.values());

        

        System.out.println("\n--- Valid Deals ---");
        deals.forEach(System.out::println);
    }
}

