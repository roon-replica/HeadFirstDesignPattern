package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.fly.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.cry.CryBehavior;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
    }

    public RedHeadDuck(CryBehavior cryBehavior, FlyBehavior flyBehavior) {
        super(cryBehavior, flyBehavior);
    }
}
