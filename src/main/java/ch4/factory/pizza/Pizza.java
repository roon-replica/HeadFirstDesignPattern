package ch4.factory.pizza;

public class Pizza {
    PizzaType pizzaType;

    public void prepare(PizzaOrder order) {
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

    enum PizzaType {
        CHEESE, POTATO, PEPPERONI
    }

    @Override
    public String toString() {
        return "피자타입: " + this.pizzaType.name();
    }
}
