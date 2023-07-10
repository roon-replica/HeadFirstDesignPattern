package ch3.decorator.beverage.concreate.decorator;

import ch3.decorator.beverage.interfaces.Beverage;
import ch3.decorator.beverage.interfaces.ComplementDecorator;

public class Mocha extends ComplementDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
