package ch3.decorator.beverage.concreate.decorator;

import ch3.decorator.beverage.interfaces.Beverage;
import ch3.decorator.beverage.interfaces.ComplementDecorator;

public class Soy extends ComplementDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy";
    }
}
