package org.example.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BoutlleMachine implements VendingMachine  {
    List<BoutlleWater> products = new ArrayList<>();
    public BoutlleWater getProductByname(String name) {
        for (BoutlleWater product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public BoutlleWater getProductByPrice(double cost) {
        for (BoutlleWater product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct (String name, double cost, String type) {
        BoutlleWater product = new BoutlleWater(name, cost, type);
        products.add(product);
    }
}
