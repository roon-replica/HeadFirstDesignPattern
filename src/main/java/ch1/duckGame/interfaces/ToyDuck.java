package ch1.duckGame.interfaces;

public class ToyDuck extends Duck implements Flyable, Quackable {
    @Override
    void swim() {
    }

    @Override
    public void fly() {
    }

    @Override
    public void quack() {
        System.out.println("quack quack toy duck");
    }
}
