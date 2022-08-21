package ch4.factory.pizzaEx.pizza.franchise.chicago;

import ch4.factory.pizzaEx.order.PizzaOrder;
import ch4.factory.pizzaEx.pizza.PepperoniPizza;

public class ChicagoPepperoniPizza extends PepperoniPizza {
    @Override
    public void bake(PizzaOrder order) {
        System.out.println("chicago pepperoni pizza is baking");
        order.state = PizzaOrder.OrderState.BAKING;
    }
}
