package ch3.decorator.beverage.concreate.beverage;

import ch3.decorator.beverage.interfaces.Beverage;

// 구체 클래스
public class MilkCoffee extends Beverage {
    public MilkCoffee() {
        description = "milk coffee";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
