package ch1.duckGame.encapsulation.eagle;

import ch1.duckGame.encapsulation.behavior.cry.CryBehavior;
import ch1.duckGame.encapsulation.behavior.fly.FlyBehavior;

public class BaldEagle extends Eagle {
    public BaldEagle(FlyBehavior flyBehavior, CryBehavior cryBehavior) {
        super(flyBehavior, cryBehavior);
    }
}
