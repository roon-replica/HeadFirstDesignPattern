package ch4.factory.pizza;

public class PizzaOrder {
    OrderState state;

    public Pizza orderPizza(Pizza.PizzaType pizzaType) throws PizzaTypeNotFoundException {
        Pizza pizza;

        // 이 코드는 변경에 닫혀있지 않다고 함
        // 메뉴를 추가하거나 제거하면 if문을 추가하거나 제거해야 함...
        if (pizzaType.equals(Pizza.PizzaType.CHEESE)) {
            pizza = new CheesePizza();
            pizza.pizzaType = Pizza.PizzaType.CHEESE;   //todo: 피자의 타입을 여기서 정하는게 적절할지? 말은 되는거 같은데
        } else if (pizzaType.equals(Pizza.PizzaType.POTATO)) {
            pizza = new PotatoPizza();
            pizza.pizzaType = Pizza.PizzaType.POTATO;
        } else if (pizzaType.equals(Pizza.PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza();
            pizza.pizzaType = Pizza.PizzaType.PEPPERONI;
        } else {
            throw new PizzaTypeNotFoundException("pizza type with " + pizzaType + "not exist");  //never
        }

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
