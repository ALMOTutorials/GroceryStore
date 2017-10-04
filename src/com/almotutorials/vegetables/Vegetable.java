package com.almotutorials.vegetables;

public class Vegetable {

    private String name;
    private int price;
    private double amountInKg;
    private boolean hasSeeds;
    private static double[] amounts = {0.5, 1.0, 2.0};

    public Vegetable(String name, int price, double amountInKg, boolean hasSeeds) {
        this.name = name;
        this.price = price;
        this.amountInKg = amountInKg;
        this.hasSeeds = hasSeeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAmountInKg() {
        return amountInKg;
    }

    public void setAmountInKg(double amountInKg) {
        this.amountInKg = amountInKg;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    public static double[] getAmounts() {
        return amounts;
    }
}
