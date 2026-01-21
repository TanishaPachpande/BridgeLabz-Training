package com.collections.mapinterface;

import java.time.LocalDate;
import java.util.*;

// ===================== POLICY CLASS =====================
class Policy {
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName +
               " | Expiry: " + expiryDate +
               " | " + coverageType +
               " | Premium: " + premiumAmount;
    }
}

// ===================== POLICY MANAGER =====================
class PolicyManager {

    // HashMap → Fast lookup by policy number
    private Map<String, Policy> hashMap = new HashMap<>();

    // LinkedHashMap → Maintain insertion order
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();

    // TreeMap → Policies sorted by expiry date
    private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        treeMap
            .computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>())
            .add(policy);
    }

    // Retrieve policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public List<Policy> getPoliciesExpiringInNext30Days() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (List<Policy> policies :
                treeMap.subMap(today, true, next30Days, true).values()) {
            result.addAll(policies);
        }
        return result;
    }

    // List policies by policyholder name
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(policy.getPolicyNumber());
            }
        }

        treeMap.headMap(today, false).clear();
    }

    // Display policies in insertion order
    public void displayInsertionOrder() {
        linkedHashMap.values().forEach(System.out::println);
    }
}

// ===================== MAIN CLASS =====================
public class InsurancePolicyManagement {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(
                "P101", "Alice", LocalDate.now().plusDays(20),
                "Health", 5000));

        manager.addPolicy(new Policy(
                "P102", "Bob", LocalDate.now().plusDays(40),
                "Auto", 3000));

        manager.addPolicy(new Policy(
                "P103", "Alice", LocalDate.now().minusDays(5),
                "Home", 7000));

        System.out.println("Retrieve Policy P101:");
        System.out.println(manager.getPolicyByNumber("P101"));

        System.out.println("\nPolicies expiring in next 30 days:");
        manager.getPoliciesExpiringInNext30Days()
               .forEach(System.out::println);

        System.out.println("\nPolicies for Alice:");
        manager.getPoliciesByHolder("Alice")
               .forEach(System.out::println);

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\nPolicies in insertion order:");
        manager.displayInsertionOrder();
    }
}

