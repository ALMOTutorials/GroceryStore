package com.almotutorials.drinks;

public class NaturalJuice extends Drink {

    private String flavor;

    public NaturalJuice(String name, boolean isSparkling, int milliliters, int price, String flavor) {
        super(name, isSparkling, milliliters, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
