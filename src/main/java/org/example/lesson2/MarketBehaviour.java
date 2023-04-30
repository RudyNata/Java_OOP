package org.example.lesson2;

import java.util.List;

public interface MarketBehaviour {
    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(Actor actor);
    public void update();
}
