package ch1.duckGame.encapsulation.behavior.cry;

public class CryEagle implements CryBehavior {
    @Override
    public void cry() {
        System.out.println("sound of eagle's crying");
    }
}
