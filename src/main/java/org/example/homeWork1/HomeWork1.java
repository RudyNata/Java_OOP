package org.example.homeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
//        1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
//           метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему
//           и температуре
//        3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
//           заложенную в программе
//        4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

        HotVendingMachine machine = new HotVendingMachine();
        machine.addProduct("Coffee", 15, 80);
        machine.addProduct("Tea", 20, 85);
        machine.addProduct("Chocolate", 20, 70);

        System.out.println(machine.getProduct("Coffee", 15, 80).toString());
        System.out.println(machine.getProduct("Tea", 20, 85).toString());

    }
}
