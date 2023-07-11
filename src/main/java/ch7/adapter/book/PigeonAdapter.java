package ch7.adapter.book;

public class PigeonAdapter implements Duck{
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.googoo();
    }

    @Override
    public void fly() {
        pigeon.fly();
    }
}
