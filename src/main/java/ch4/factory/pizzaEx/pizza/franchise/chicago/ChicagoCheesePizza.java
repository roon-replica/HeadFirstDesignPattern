package ch4.factory.pizzaEx.pizza.franchise.chicago;

import ch4.factory.pizzaEx.PizzaOrder;
import ch4.factory.pizzaEx.pizza.CheesePizza;

public class ChicagoCheesePizza extends CheesePizza {
    @Override
    public void receivedOrder(PizzaOrder order) {
        System.out.println("chicago style pizza is ordered.");
        order.state = PizzaOrder.OrderState.RECEIVED_ORDER;
    }
}
