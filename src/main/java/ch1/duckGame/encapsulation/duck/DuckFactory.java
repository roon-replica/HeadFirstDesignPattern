package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.BehaviorFactory;

public class DuckFactory {
    public static Duck redHeadDuck(){
        return new RedHeadDuck(BehaviorFactory.cry(), BehaviorFactory.flyWithWings());
    }

    public static Duck toyDuck(){
        return new ToyDuck(BehaviorFactory.cry(),BehaviorFactory.flyNoWay());
    }
}
