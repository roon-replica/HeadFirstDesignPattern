package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.QuackBehavior;

public class ToyDuck extends Duck{

    public ToyDuck(){}

    public ToyDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior){
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
}
