package org.example.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
        // содержащий в себе методы getProductByname и getProductByPrice

//        VendingMachine machine = new VendingMachine();
//        machine.addProduct("Coca-cola", 100);
//        machine.addProduct("Snikers", 50);
//        machine.addProduct("Coca-cola", 100);
//
//        System.out.println(machine.getProductByPrice(50).toString());
//        System.out.println(machine.getProductByname("Coca-cola").toString());

        // Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
        // сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа
        // ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

        BoutlleMachine machine = new BoutlleMachine();
        machine.addProduct("Coca-cola", 100, "");
        machine.addProduct("Water", 50, "");
        machine.addProduct("Sprite", 80, "");

        System.out.println(machine.getProductByPrice(50).toString());
        System.out.println(machine.getProductByname("Sprite").toString());
    }
}