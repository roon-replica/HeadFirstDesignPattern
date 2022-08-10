package ch1.duckGame.encapsulation.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
