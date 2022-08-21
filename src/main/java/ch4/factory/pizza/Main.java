package ch4.factory.pizza;

import ch4.factory.pizza.pizza.Pizza;
import ch4.factory.pizza.pizza.PizzaType;

public class Main {
    public static void main(String[] args) throws PizzaTypeNotFoundException {
        var pizzaOrder = new NewYorkPizzaOrder();
        var pizza = pizzaOrder.orderPizza(PizzaType.CHEESE);

        System.out.println(pizza + " " + pizzaOrder);
    }
}
