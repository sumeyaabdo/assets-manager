package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        // Calculate the vehicle's age
        int currentYear = java.time.LocalDate.now().getYear();
        int age = currentYear - year;

        // Calculate vehicle value based on age
        BigDecimal value;

        if (age > 10) {
            value = new BigDecimal("1000.00");
        } else {
            BigDecimal depreciationRate;

            if (age <= 3) {
                depreciationRate = new BigDecimal("0.03");
            } else if (age <= 6) {
                depreciationRate = new BigDecimal("0.06");
            } else {
                depreciationRate = new BigDecimal("0.08");
            }

            // Subtract depreciation from the original cost
            BigDecimal depreciation = getOriginalCost()
                    .multiply(depreciationRate)
                    .multiply(BigDecimal.valueOf(age));

            value = getOriginalCost().subtract(depreciation);
        }

        // Reduce value by 25% for high mileage, except Honda and Toyota
        if (odometer > 100000
                && !makeModel.toLowerCase().contains("honda")
                && !makeModel.toLowerCase().contains("toyota")) {

            value = value.multiply(new BigDecimal("0.75"));

            return value;
        }
    }
}
