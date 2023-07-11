package ch7.adapter.book;

public class CityPigeon implements Pigeon {
    @Override
    public void googoo() {
        System.out.println("goo goo");
    }

    @Override
    public void fly() {
        System.out.println("We can fly a little");
    }
}
