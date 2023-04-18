package org.example.lesson1;

import java.util.ArrayList;
import java.util.List;
//Lesson1
public interface VendingMachine {
    List<Product> products = new ArrayList<>();

    public Product getProductByname(String name);

    public Product getProductByPrice(double cost);

    public void addProduct (String name, double cost, String type);
}

