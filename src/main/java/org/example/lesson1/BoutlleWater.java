package org.example.lesson1;

public class BoutlleWater extends Product {
    BoutlleWater (String name, double cost, String type) {
        super(name, cost, type);
        super.name = name;
        super.cost = cost;
        super.type = "Boutlle";
    }

}
