package ch7.adapter.book;

public class DonalDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("donal duck duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
