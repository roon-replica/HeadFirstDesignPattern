package ch1.duckGame.encapsulation.duck;

import ch1.duckGame.encapsulation.behavior.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.CryBehavior;

public abstract class Duck {
    // duck 클래스와 행동(fly, quack)을 분리하여 행동들의 재사용성을 높인거라고 함..
    FlyBehavior flyBehavior;
    CryBehavior cryBehavior;

    public Duck() {
    }

    public Duck(CryBehavior cryBehavior, FlyBehavior flyBehavior) {
        this.cryBehavior = cryBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void cry() {
        cryBehavior.cry();
    }
}
