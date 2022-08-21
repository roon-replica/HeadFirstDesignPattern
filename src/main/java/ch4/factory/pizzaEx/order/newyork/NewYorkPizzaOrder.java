package ch4.factory.pizzaEx.order.newyork;

import ch4.factory.pizzaEx.PizzaOrder;
import ch4.factory.pizzaEx.PizzaTypeNotFoundException;
import ch4.factory.pizzaEx.pizza.*;
import ch4.factory.pizzaEx.pizza.franchise.newyork.NewYorkCheesePizza;
import ch4.factory.pizzaEx.pizza.franchise.newyork.NewYorkPepperoniPizza;
import ch4.factory.pizzaEx.pizza.franchise.newyork.NewYorkPotatoPizza;

public class NewYorkPizzaOrder extends PizzaOrder {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza = new NewYorkCheesePizza();
            pizza.pizzaType = PizzaType.CHEESE;   //todo: 피자의 타입을 여기서 정하는게 적절할지? 말은 되는거 같은데
        } else if (pizzaType.equals(PizzaType.POTATO)) {
            pizza = new NewYorkPotatoPizza();
            pizza.pizzaType = PizzaType.POTATO;
        } else if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new NewYorkPepperoniPizza();
            pizza.pizzaType = PizzaType.PEPPERONI;
        } else {
            try {
                throw new PizzaTypeNotFoundException("pizza type not exist"); //never
            } catch (PizzaTypeNotFoundException e) {
                e.printStackTrace();
            }
        }

        return pizza;
    }
}
