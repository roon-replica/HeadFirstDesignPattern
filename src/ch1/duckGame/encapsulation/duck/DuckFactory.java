package ch1.duckGame.encapsulation.duck;

public class DuckFactory {
    public static Duck redHeadDuck(){
        return new RedHeadDuck(BehaviorFactory.quack(), BehaviorFactory.flyWithWings());
    }

    public static Duck toyDuck(){
        return new ToyDuck(BehaviorFactory.quack(),BehaviorFactory.flyNoWay());
    }
}
