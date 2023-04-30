package org.example.lesson2;

public class Human extends Actor {
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }
    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
