package ch3.decorator.beverage.concreate.beverage;

import ch3.decorator.beverage.interfaces.Beverage;

// 구체 클래스
public class Espresso extends Beverage {
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1;
    }
}
