package ch1.duckGame.encapsulation.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
