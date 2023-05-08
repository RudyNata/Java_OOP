package org.example.lesson4;

public class Chips {
    private int weight;
    private String taste;
    public Chips(int weight, String taste) {
        this.weight = weight;
        this.taste = taste;
    }
    @Override
    public String toString() {
        return String.format("Chips with taste %s, weight - %d gm", taste, weight);
    }
}
