package org.example.lesson2;

public interface QueueBehaviour {
    public void takeInQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
