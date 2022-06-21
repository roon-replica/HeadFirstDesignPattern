package ch1.duckGame.encapsulation.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("mute (quack quack..)");
    }
}
