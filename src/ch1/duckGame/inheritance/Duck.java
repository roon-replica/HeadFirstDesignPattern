package ch1.duckGame.inheritance;

public abstract class Duck {
    void quack() {
        System.out.println("quack quack");
    }

    void fly() {
        System.out.println("I am flying");
    }

    abstract void swim();
}
