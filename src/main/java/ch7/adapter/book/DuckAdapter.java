package ch7.adapter.book;

public class DuckAdapter implements Pigeon{
    Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void googoo() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
