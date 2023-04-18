package org.example.lesson1;



// Lesson1
public abstract class Product {
    protected String name;
    protected double cost;
    public String type;

    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }

    Product (String name, double cost, String type) {
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public String toString() {
        return String.format("Product name: %s, Cost: %f, Type: %s", name, cost, type);
    }
}
