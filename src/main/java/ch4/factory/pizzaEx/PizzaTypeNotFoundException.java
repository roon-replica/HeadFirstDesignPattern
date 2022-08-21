package ch4.factory.pizzaEx;

public class PizzaTypeNotFoundException extends Throwable {
    private String msg;

    public PizzaTypeNotFoundException(String msg) {
        this.msg = msg;
    }
}
