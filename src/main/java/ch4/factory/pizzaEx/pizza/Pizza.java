package ch4.factory.pizzaEx.pizza;

import ch4.factory.pizzaEx.order.PizzaOrder;

public abstract class Pizza {
    public PizzaType pizzaType;

    public void receivedOrder(PizzaOrder order) {
        System.out.println("receive order");
        order.state = PizzaOrder.OrderState.RECEIVED_ORDER;
    }

    public void bake(PizzaOrder order) {
        System.out.println("baking");
        order.state = PizzaOrder.OrderState.BAKING;
    }

    public void box(PizzaOrder order) {
        System.out.println("boxing pizza");
        order.state = PizzaOrder.OrderState.BOXED;
    }

    @Override
    public String toString() {
        return "피자타입: " + this.pizzaType.name() +" 클래스명: " + this.getClass().getSimpleName();
    }
}
