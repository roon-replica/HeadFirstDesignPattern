package ch4.factory.pizzaEx;

import ch4.factory.pizzaEx.pizza.*;

// 피자 객체 생성만 담당!(Single Responsibility)
// 피자 객체 생성 작업을 캡슐화해 놓음으로써 피자 생성 로직을 수정할 때, 여기저기서 수정하지 않고 여기만 수정하면 됨!
public class SimplePizzaFactory {

    // static으로 선언하면 팩토리의 인스턴스를 만들지 않아도 된다는 장점이 있음
    // 대신 서브클래스를 만들어서 오버라이드는 불가..!
    public static Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza();
            pizza.pizzaType = PizzaType.CHEESE;   //todo: 피자의 타입을 여기서 정하는게 적절할지? 말은 되는거 같은데
        } else if (pizzaType.equals(PizzaType.POTATO)) {
            pizza = new PotatoPizza();
            pizza.pizzaType = PizzaType.POTATO;
        } else if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza();
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
