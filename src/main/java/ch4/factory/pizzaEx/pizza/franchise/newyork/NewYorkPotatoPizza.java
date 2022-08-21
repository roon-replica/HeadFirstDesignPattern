package ch4.factory.pizzaEx.pizza.franchise.newyork;

import ch4.factory.pizzaEx.PizzaOrder;
import ch4.factory.pizzaEx.pizza.PotatoPizza;

public class NewYorkPotatoPizza extends PotatoPizza {
    @Override
    public void box(PizzaOrder order) {
        System.out.println("new york potato pizza is boxed.");
        order.state = PizzaOrder.OrderState.BOXED;
    }
}
