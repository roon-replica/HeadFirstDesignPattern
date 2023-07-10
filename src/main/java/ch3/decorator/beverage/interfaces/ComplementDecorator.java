package ch3.decorator.beverage.interfaces;

// 추상 데코레이터
public abstract class ComplementDecorator extends Beverage { // Beverage 객체가 들어갈 자리에 들어갈 수 있어야 해서 형식맞추는 상속..!
    // Decorator가 감쌀 객체
    // 어떤 음료든 감쌀 수 있도록 Beverage 추상 클래스 사용한거라고 함
    protected Beverage beverage;

    public abstract String getDescription();
}
