package com.almotutorials.fruits;

public class Orange extends Fruit {

    private String countryOfOrigin;

    public Orange(String name, int price, double amountInKg, String countryOfOrigin) {
        super(name, price, amountInKg);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
