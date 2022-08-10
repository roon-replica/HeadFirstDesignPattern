package ch1.duckGame.interfaces;

// fly, quack 동작을 변경하려면 서브클래스들을 모두 수정해야 한다고 함..
// 근데 서브클래스가 그리 많나? 100개 이하는 그냥 하면 될 거 같은데...
public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    void swim() {
    }

    @Override
    public void fly() {
        System.out.println("I am flying red head duck");
    }

    @Override
    public void quack() {
        System.out.println("quack quack red head duck");
    }
}
