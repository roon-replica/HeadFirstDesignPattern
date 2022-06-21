package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.QuackBehavior;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){}

    public RedHeadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
}
