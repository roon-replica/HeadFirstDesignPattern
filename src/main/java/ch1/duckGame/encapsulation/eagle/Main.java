package ch1.duckGame.encapsulation.eagle;

public class Main {
    public static void main(String[] args) {
        Eagle baldEagle = EagleFactory.baldEagle();
        baldEagle.cry();
        baldEagle.fly();
    }
}
