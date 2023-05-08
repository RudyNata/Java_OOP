package org.example.homeWork4;

public class Tea {
    private String type;
    private int value;
    public Tea(String type, int value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Cup of %s tea, value - %d ml", type, value);
    }
}
