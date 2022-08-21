package ch4.factory.pizza;

public class PizzaOrder {
    OrderState state;

    public Pizza orderPizza(Pizza.PizzaType pizzaType) throws PizzaTypeNotFoundException {

        var pizza = SimplePizzaFactory.createPizza(pizzaType);

        // 이부분은 거의 변경되지 않는 부분!
        pizza.prepare(this);
        pizza.bake(this);
        pizza.box(this);

        return pizza;
    }

    enum OrderState {
        RECEIVED_ORDER, BAKING, BOXED
    }

    @Override
    public String toString() {
        return "주문 상태: " + state;
    }
}
