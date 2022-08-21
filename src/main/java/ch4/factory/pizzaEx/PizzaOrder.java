package ch4.factory.pizzaEx;

import ch4.factory.pizzaEx.PizzaTypeNotFoundException;
import ch4.factory.pizzaEx.pizza.Pizza;
import ch4.factory.pizzaEx.pizza.PizzaType;

public abstract class PizzaOrder {
    public OrderState state;

    public Pizza orderPizza(PizzaType pizzaType) throws PizzaTypeNotFoundException {

//        var pizza = SimplePizzaFactory.createPizza(pizzaType);
        var pizza = createPizza(pizzaType);

        // 이부분은 거의 변경되지 않는 부분!
        pizza.receivedOrder(this);
        pizza.bake(this);
        pizza.box(this);

        return pizza;
    }

    // 팩토리 메서드를 추상메서드로 선언해서 서브 팩토리 클래스가 구체적인 생성을 책임지도록 하는 방식..!
    public abstract Pizza createPizza(PizzaType pizzaType);

    public enum OrderState {
        RECEIVED_ORDER, BAKING, BOXED
    }

    @Override
    public String toString() {
        return "주문 상태: " + state +"  클래스명: "+ this.getClass().getSimpleName();
    }


}
