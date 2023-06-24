package ch1.duckGame.encapsulation.duck;

public class Main {
    public static void main(String[] args) {
        Duck readHeadDuck = DuckFactory.redHeadDuck();
        readHeadDuck.fly();
        readHeadDuck.cry();

        Duck toyDuck = DuckFactory.toyDuck();
        toyDuck.fly();
        toyDuck.cry();
    }
}
