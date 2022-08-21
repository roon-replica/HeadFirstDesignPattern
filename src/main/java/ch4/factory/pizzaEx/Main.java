package ch4.factory.pizzaEx;

import ch4.factory.pizzaEx.order.newyork.NewYorkPizzaOrder;
import ch4.factory.pizzaEx.pizza.PizzaType;

public class Main {
    public static void main(String[] args) throws PizzaTypeNotFoundException {
        var pizzaOrder = new NewYorkPizzaOrder();
        var pizza = pizzaOrder.orderPizza(PizzaType.CHEESE);

        System.out.println(pizza + " " + pizzaOrder);
    }
}
