package com.pluralsight;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Store all assets in one list
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add my first house
        House myHouse = new House(
                "My House",
                "2023-06-15",
                new BigDecimal("250000.00"),
                "123 Main Street",
                1,
                2000,
                5000
        );

        myAssets.add(myHouse);
    }
}
