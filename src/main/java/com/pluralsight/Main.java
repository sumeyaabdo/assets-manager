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

        // Add my vacation house
        House vacationHouse = new House(
                "My Vacation House",
                "2024-08-10",
                new BigDecimal("180000.00"),
                "456 Lake View Drive",
                2,
                1500,
                4000
        );

        myAssets.add(vacationHouse);

        // Add my first vehicle
        Vehicle myCar = new Vehicle(
                "My Car",
                "2022-05-15",
                new BigDecimal("25000.00"),
                "Toyota Camry",
                2022,
                65000
        );

        myAssets.add(myCar);

        // Add my second vehicle
        Vehicle myTruck = new Vehicle(
                "Tom's Truck",
                "2020-03-20",
                new BigDecimal("35000.00"),
                "Ford F-150",
                2020,
                120000
        );

        myAssets.add(myTruck);

        // Display all assets and their values
        for (Asset asset : myAssets) {
            System.out.println("--------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Check the asset type and display its specific details
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("House Address: " + house.getAddress());

            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
        }
    }
}
