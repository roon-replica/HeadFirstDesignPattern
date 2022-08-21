package ch4.factory.pizza;

public class Main {
    public static void main(String[] args) throws PizzaTypeNotFoundException {
        var pizzaOrder = new PizzaOrder();
        var pizza = pizzaOrder.orderPizza(Pizza.PizzaType.CHEESE);

        System.out.println(pizza + " " + pizzaOrder);
    }
}
