package ch1.duckGame.encapsulation.eagle;

import ch1.duckGame.encapsulation.behavior.BehaviorFactory;

public class EagleFactory {
    public static Eagle baldEagle() {
        return new BaldEagle(BehaviorFactory.flyWithWings(), BehaviorFactory.cryEagle());
    }
}
