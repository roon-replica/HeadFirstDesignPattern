package ch1.duckGame.encapsulation.behavior;

import ch1.duckGame.encapsulation.behavior.cry.Cry;
import ch1.duckGame.encapsulation.behavior.cry.CryBehavior;
import ch1.duckGame.encapsulation.behavior.cry.CryEagle;
import ch1.duckGame.encapsulation.behavior.cry.MuteCry;
import ch1.duckGame.encapsulation.behavior.fly.FlyBehavior;
import ch1.duckGame.encapsulation.behavior.fly.FlyNoWay;
import ch1.duckGame.encapsulation.behavior.fly.FlyWithWings;

public class BehaviorFactory {
    public static FlyBehavior flyNoWay() {
        return new FlyNoWay();
    }

    public static FlyBehavior flyWithWings() {
        return new FlyWithWings();
    }

    public static CryBehavior cry() {
        return new Cry();
    }

    public static CryBehavior muteCry() {
        return new MuteCry();
    }

    public static CryBehavior cryEagle() {
        return new CryEagle();
    }
}
