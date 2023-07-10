package ch3.decorator.beverage;

import ch3.decorator.beverage.concreate.beverage.Espresso;
import ch3.decorator.beverage.concreate.beverage.MilkCoffee;
import ch3.decorator.beverage.concreate.decorator.Soy;
import ch3.decorator.beverage.concreate.decorator.Whip;
import ch3.decorator.beverage.interfaces.Beverage;
import ch3.decorator.beverage.concreate.decorator.Mocha;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        log.info("[espresso] description: {}, cost:{}$", espresso.getDescription(), espresso.cost());

        Beverage milkCoffee = new MilkCoffee();
        milkCoffee = new Soy(milkCoffee);
        milkCoffee = new Mocha(milkCoffee);
        milkCoffee = new Whip(milkCoffee);

        log.info("[milkCoffee] description: {}, cost:{}$", milkCoffee.getDescription(), milkCoffee.cost());
    }
}
