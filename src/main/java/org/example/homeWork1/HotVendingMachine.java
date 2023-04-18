package org.example.homeWork1;

import org.example.lesson1.BoutlleWater;

import java.util.ArrayList;
import java.util.List;

public class HotVendingMachine implements VendingMachine{
    List<HotDrink> drinks = new ArrayList<>();
    public Drink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName() == name && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
    public void addProduct (String name, int volume, int temperature) {
        HotDrink drink = new HotDrink(name, volume, temperature);
        drinks.add(drink);
    }
}
