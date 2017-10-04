package com.almotutorials.vegetables;

public class Potato extends Vegetable {

    private boolean isGardenFresh;

    public Potato(String name, int price, double amountInKg, boolean hasSeeds, boolean isGardenFresh) {
        super(name, price, amountInKg, hasSeeds);
        this.isGardenFresh = isGardenFresh;
    }

    public boolean isGardenFresh() {
        return isGardenFresh;
    }

    public void setGardenFresh(boolean gardenFresh) {
        isGardenFresh = gardenFresh;
    }
}
