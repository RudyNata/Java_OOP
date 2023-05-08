package org.example.homeWork4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T> {
    private List<T> drinks = new ArrayList<>();
    public List<T> getProduct() {
        return drinks;
    }
    public void addProduct (T drink) {
        drinks.add(drink);
    }
}
