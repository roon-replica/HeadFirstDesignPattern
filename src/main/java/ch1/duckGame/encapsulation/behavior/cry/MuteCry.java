package ch1.duckGame.encapsulation.behavior.cry;

public class MuteCry implements CryBehavior {
    @Override
    public void cry() {
        System.out.println("mute (quack quack..)");
    }
}
