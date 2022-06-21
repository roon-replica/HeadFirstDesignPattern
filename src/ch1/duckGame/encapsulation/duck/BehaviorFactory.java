package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.*;

public class BehaviorFactory {
    public static FlyBehavior flyNoWay(){
        return new FlyNoWay();
    }

    public static FlyBehavior flyWithWings(){
        return new FlyWithWings();
    }

    public static QuackBehavior quack(){
        return new Quack();
    }

    public static QuackBehavior muteQuack(){
        return new MuteQuack();
    }
}
