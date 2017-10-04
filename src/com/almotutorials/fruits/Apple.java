package com.almotutorials.fruits;

public class Apple extends Fruit {

    private String appleVariety;

    public Apple(String name, int price, double amountInKg, String appleVariety) {
        super(name, price, amountInKg);
        this.appleVariety = appleVariety;
    }

    public String getAppleVariety() {
        return appleVariety;
    }

    public void setAppleVariety(String appleVariety) {
        this.appleVariety = appleVariety;
    }
}
