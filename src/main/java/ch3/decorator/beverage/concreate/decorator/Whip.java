package ch3.decorator.beverage.concreate.decorator;

import ch3.decorator.beverage.interfaces.Beverage;
import ch3.decorator.beverage.interfaces.ComplementDecorator;

public class Whip extends ComplementDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.05;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip";
    }
}
