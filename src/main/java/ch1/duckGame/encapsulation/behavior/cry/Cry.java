package ch1.duckGame.encapsulation.behavior.cry;

public class Cry implements CryBehavior {
    @Override
    public void cry() {
        System.out.println("sound of default crying");
    }
}
