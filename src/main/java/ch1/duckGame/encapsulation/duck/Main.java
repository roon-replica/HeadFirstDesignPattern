package ch1.duckGame.encapsulation.duck;

public class Main {
    public static void main(String[] args) {
        Duck readHeadDuck = DuckFactory.redHeadDuck();
        readHeadDuck.fly();
        readHeadDuck.quack();

        Duck toyDuck = DuckFactory.toyDuck();
        toyDuck.fly();
        toyDuck.quack();
    }
}
