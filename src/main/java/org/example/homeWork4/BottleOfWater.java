package org.example.homeWork4;

public class BottleOfWater {
    private int value;
    public BottleOfWater(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Bottle of water, value - %d l", value);
    }
}
