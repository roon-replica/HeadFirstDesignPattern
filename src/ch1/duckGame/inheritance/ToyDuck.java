package ch1.duckGame.inheritance;

public class ToyDuck extends Duck {
    // 장난감 오리는 날면 안 됨
    // -> 이처럼 서브클래스마다 오버라이드 해야 하는 문제 발생
    //    부모 클래스에 코드를 조금 추가했을 뿐인데 상속한 서브클래스들에서 예상치 못한 문제 발생 가스
    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }
}
