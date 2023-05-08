package org.example.homeWork4;

public class Coffee {
    private String type;
    public Coffee(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("%s", type);
    }
}
