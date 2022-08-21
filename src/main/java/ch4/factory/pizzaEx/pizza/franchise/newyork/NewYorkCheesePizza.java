package ch4.factory.pizzaEx.pizza.franchise.newyork;

import ch4.factory.pizzaEx.order.PizzaOrder;
import ch4.factory.pizzaEx.pizza.CheesePizza;

public class NewYorkCheesePizza extends CheesePizza {
    @Override
    public void receivedOrder(PizzaOrder order) {
        System.out.println("new york style pizza is ordered.");
        order.state = PizzaOrder.OrderState.RECEIVED_ORDER;
    }
}
