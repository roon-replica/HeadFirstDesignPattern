package ch4.factory.pizzaEx.pizza.franchise.chicago;

import ch4.factory.pizzaEx.order.PizzaOrder;
import ch4.factory.pizzaEx.pizza.PotatoPizza;

public class ChicagoPotatoPizza extends PotatoPizza {
    @Override
    public void box(PizzaOrder order) {
        System.out.println("chicago potato pizza is boxed.");
        order.state = PizzaOrder.OrderState.BOXED;
    }
}
