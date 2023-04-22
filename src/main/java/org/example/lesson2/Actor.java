package org.example.lesson2;

public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected String name;

    public abstract String getName();

}
