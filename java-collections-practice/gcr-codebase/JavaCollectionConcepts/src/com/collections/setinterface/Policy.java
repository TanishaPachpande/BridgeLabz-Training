package com.collections.setinterface;

import java.time.LocalDate;

public class Policy implements Comparable<Policy> {

    int policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    String coverageType;
    int premiumAmount;

    public Policy(int policyNumber, String policyHolder,
                  LocalDate expiryDate, String coverageType,
                  int premiumAmount) {

        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // TreeSet sorting by expiry date
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    // Uniqueness based on policy number
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Policy))
            return false;

        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolder + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}
