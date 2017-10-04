package com.almotutorials.fruits;

public class Fruit {

    private String name;
    private int price;
    private double amountInKg;
    private static String[] fruitTypes = {"apples", "oranges"};
    private static String[] countries = {"Spain", "Greece"};
    private static String[] appleTypes = {"granny", "gala"};
    private static double[] amounts = {0.5, 1.0, 2.0};

    public Fruit(String name, int price, double amountInKg) {
        this.name = name;
        this.price = price;
        this.amountInKg = amountInKg;
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

    public static String[] getFruitTypes() {
        return fruitTypes;
    }

    public static String[] getCountries() {
        return countries;
    }

    public static String[] getAppleTypes() {
        return appleTypes;
    }

    public static double[] getAmounts() {
        return amounts;
    }
}
