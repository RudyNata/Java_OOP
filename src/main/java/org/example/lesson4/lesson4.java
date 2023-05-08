package org.example.lesson4;

public class lesson4 {
    public static void main (String[] args) {
        Animal<Cat> catAnimal = new Animal<>();
        Animal<Dog> dogAnimal = new Animal<>();
        catAnimal.setAnimal(new Cat("Koshka"));
        dogAnimal.setAnimal(new Dog("Sharik", 4, 5));
        System.out.println(catAnimal.getInfoAboutAnimal());
        System.out.println(dogAnimal.getInfoAboutAnimal());

        VendingMachine<Chips> vendingMachineForChips = new VendingMachine<>();
        VendingMachine<Coffee> vendingMachineForCoffee = new VendingMachine<>();
        VendingMachine<BottleOfWater> vendingMachineForWater = new VendingMachine<>();

        vendingMachineForChips.addProducts(new Chips(10, "Onion"));
        vendingMachineForCoffee.addProducts(new Coffee("Latte"));
        vendingMachineForWater.addProducts(new BottleOfWater(1));

        System.out.println(vendingMachineForChips.getAll().toString());
        System.out.println(vendingMachineForCoffee.getAll().toString());
        System.out.println(vendingMachineForWater.getAll().toString());
    }
}
