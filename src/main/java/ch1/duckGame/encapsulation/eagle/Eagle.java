package ch1.duckGame.encapsulation.eagle;

import ch1.duckGame.encapsulation.behavior.CryBehavior;
import ch1.duckGame.encapsulation.behavior.FlyBehavior;

public abstract class Eagle {
    private final FlyBehavior flyBehavior;
    private final CryBehavior cryBehavior;

    public Eagle(FlyBehavior flyBehavior, CryBehavior cryBehavior) {
        this.flyBehavior = flyBehavior;
        this.cryBehavior = cryBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void cry() {
        cryBehavior.cry();
    }
}
