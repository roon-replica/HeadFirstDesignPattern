package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.CryBehavior;

public class ToyDuck extends Duck {

    public ToyDuck() {
    }

    public ToyDuck(CryBehavior cryBehavior, FlyBehavior flyBehavior) {
        super(cryBehavior, flyBehavior);
    }
}
