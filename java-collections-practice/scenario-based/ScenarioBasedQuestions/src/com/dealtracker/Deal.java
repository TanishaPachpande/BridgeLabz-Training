package com.dealtracker;

import java.time.LocalDate;

public class Deal<T> {

    private String dealCode;
    private LocalDate validTill;
    private int discountPercentage;
    private int minimumPurchase;
    private T promotionType;

    public Deal(String dealCode, LocalDate validTill,
                int discountPercentage, int minimumPurchase,
                T promotionType) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discountPercentage = discountPercentage;
        this.minimumPurchase = minimumPurchase;
        this.promotionType = promotionType;
    }

    public String getDealCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public String toString() {
        return dealCode + " | " + discountPercentage +
                "% | Valid Till: " + validTill;
    }
}

