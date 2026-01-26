package com.medinventory;

import java.time.LocalDate;

public class InventoryItem<T> {

    private String itemId;
    private T itemType;
    private int quantity;
    private LocalDate expiryDate;

    public InventoryItem(String itemId, T itemType, int quantity, LocalDate expiryDate) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getItemId() {
        return itemId;
    }

    public T getItemType() {
        return itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InventoryItem)) return false;
        InventoryItem<?> other = (InventoryItem<?>) obj;
        return itemId.equals(other.itemId);
    }

    @Override
    public int hashCode() {
        return itemId.hashCode();
    }

    @Override
    public String toString() {
        return itemType + " | Qty: " + quantity + " | Expiry: " + expiryDate;
    }
}

