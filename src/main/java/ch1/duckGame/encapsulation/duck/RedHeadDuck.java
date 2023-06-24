package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.CryBehavior;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
    }

    public RedHeadDuck(CryBehavior cryBehavior, FlyBehavior flyBehavior) {
        super(cryBehavior, flyBehavior);
    }
}
