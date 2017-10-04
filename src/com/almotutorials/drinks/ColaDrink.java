package com.almotutorials.drinks;

public class ColaDrink extends Drink {

    private String colaCompanyName;

    public ColaDrink(String name, boolean isSparkling, int milliliters, int price, String colaCompanyName) {
        super(name, isSparkling, milliliters, price);
        this.colaCompanyName = colaCompanyName;
    }

    public String getColaCompanyName() {
        return colaCompanyName;
    }

    public void setColaCompanyName(String colaCompanyName) {
        this.colaCompanyName = colaCompanyName;
    }
}
