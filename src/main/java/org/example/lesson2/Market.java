package org.example.lesson2;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> actors = new ArrayList<Actor>();
    private Queue<Actor> actorsQueue = new ArrayDeque<Actor>();
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
    }
    public void takeOrders() {
        Actor actor = actorsQueue.peek();
        if (actor instanceof Human) {
            ((Human)actor).setMakeOrder();
        }
    }
    public void giveOrders() {
        Actor actor = actorsQueue.peek();
        if (actor instanceof Human) {
            ((Human)actor).setTakeOrder();
        }
    }
    public void releaseFromQueue() {
        actorsQueue.poll();
    }
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
    }
    public void update() {
    }
}
