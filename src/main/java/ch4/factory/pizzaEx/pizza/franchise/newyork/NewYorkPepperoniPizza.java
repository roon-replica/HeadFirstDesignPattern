package ch4.factory.pizzaEx.pizza.franchise.newyork;

import ch4.factory.pizzaEx.order.PizzaOrder;
import ch4.factory.pizzaEx.pizza.PepperoniPizza;

public class NewYorkPepperoniPizza extends PepperoniPizza {
    @Override
    public void bake(PizzaOrder order) {
        System.out.println("new york pepperoni pizza is baking");
        order.state = PizzaOrder.OrderState.BAKING;
    }
}
