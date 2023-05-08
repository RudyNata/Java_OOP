package org.example.homeWork4;

import org.example.lesson4.BottleOfWater;
import org.example.lesson4.Chips;
import org.example.lesson4.VendingMachine;

public class HomeWork4 {
    public static void main(String[] args) {
//        1. Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться
//           от классов под каждый тип продукта, заменив единым классом - торговым автоматом
        VendingMachine<Tea> vmForTea = new VendingMachine<>();
        VendingMachine<Coffee> vmForCoffee = new VendingMachine<>();
        VendingMachine<BottleOfWater> vmForWater = new VendingMachine<>();

        vmForTea.addProducts(new Tea("Green", 15));
        vmForTea.addProducts(new Tea("Black", 30));

        vmForCoffee.addProducts(new Coffee("Latte"));
        vmForCoffee.addProducts(new Coffee("Capuchin"));
        vmForCoffee.addProducts(new Coffee("Espresso"));

        vmForWater.addProducts(new BottleOfWater(1));

        System.out.println(vmForTea.getAll().toString());
        System.out.println(vmForCoffee.getAll().toString());
        System.out.println(vmForWater.getAll().toString());

    }
}
