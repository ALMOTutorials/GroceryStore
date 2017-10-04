package com.almotutorials.drinks;

public class StillWater extends Drink {

    private String waterCompany;

    public StillWater(String name, boolean isSparkling, int milliliters, int price, String waterCompany) {
        super(name, isSparkling, milliliters, price);
        this.waterCompany = waterCompany;
    }

    public String getWaterCompany() {
        return waterCompany;
    }

    public void setWaterCompany(String waterCompany) {
        this.waterCompany = waterCompany;
    }
}
