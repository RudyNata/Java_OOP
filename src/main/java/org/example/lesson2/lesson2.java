package org.example.lesson2;

public class lesson2 {
    public static void main(String[] args) {
//      1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
//      2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
//         заказ и факт получения заказа. Дополнение: для большего понимания у студентов, можно сделать методы-геттеры
//         для имени и прочих “персональных данных” abstract
//      3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
        Human human = new Human();
        human.setName("Kate");
        human.setMakeOrder();
        human.setTakeOrder();
        System.out.println(human.getName());
        System.out.println(human.isMakeOrder());
        System.out.println(human.isTakeOrder());


//      1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
//         принятие/отдача заказа
//      2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление
//         состояния магазина
//      3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в
//         очереди в различных статусах
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
