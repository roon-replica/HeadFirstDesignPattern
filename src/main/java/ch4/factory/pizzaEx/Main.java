package ch4.factory.pizzaEx;

import ch4.factory.pizzaEx.order.chicago.ChicagoPizzaOrder;
import ch4.factory.pizzaEx.order.newyork.NewYorkPizzaOrder;
import ch4.factory.pizzaEx.pizza.PizzaType;

public class Main {
    public static void main(String[] args) throws PizzaTypeNotFoundException {
        var myPizzaOrder = new NewYorkPizzaOrder();
        var myPizza = myPizzaOrder.orderPizza(PizzaType.CHEESE);

        System.out.println(myPizza);
        System.out.println(myPizzaOrder);


        var hisPizzaOrder = new ChicagoPizzaOrder();
        var hisPizza = hisPizzaOrder.orderPizza(PizzaType.POTATO);

        System.out.println(hisPizza);
        System.out.println(hisPizzaOrder);
    }
}
