package ch1.duckGame.encapsulation.behavior;

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
