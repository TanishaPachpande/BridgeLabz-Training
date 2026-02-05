package com.dealtracker;
import java.time.LocalDate;

public class Deal<T> implements Promotion<T> {

    private String dealCode;
    private LocalDate validTill;
    private T discount;
    private int minimumPurchase;

    public Deal(String dealCode, LocalDate validTill, T discount, int minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discount = discount;
        this.minimumPurchase = minimumPurchase;
    }

    public String getDealCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public int getMinimumPurchase() {
        return minimumPurchase;
    }

    @Override
    public T getBenefit() {
        return discount;
    }

    @Override
    public String toString() {
        return dealCode + " | Discount: " + discount +
                " | Valid Till: " + validTill +
                " | Min Purchase: " + minimumPurchase;
    }
}

