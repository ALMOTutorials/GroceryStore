package com.almotutorials.drinks;

public class Drink {

    private String name;
    private boolean isSparkling;
    private int milliliters;
    private int price;
    private static String[] drinkTypes = {"still", "sparkling", "lemonade", "cola"};
    private static int[] drinkSizes = {500, 1000, 2000};

    public Drink(String name, boolean isSparkling, int milliliters, int price) {
        this.name = name;
        this.isSparkling = isSparkling;
        this.milliliters = milliliters;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(int milliliters) {
        this.milliliters = milliliters;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String[] getDrinkTypes() {
        return drinkTypes;
    }

    public static int[] getDrinkSizes() {
        return drinkSizes;
    }
}
