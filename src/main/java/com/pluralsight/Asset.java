package com.pluralsight;
import java.math.BigDecimal;

public class Asset {
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    public Asset(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
}
