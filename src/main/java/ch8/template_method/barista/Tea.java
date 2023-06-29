package ch8.template_method.barista;

public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("brewing tea");
    }

    @Override
    public void addComplements() {
        System.out.println("adding lemon");
    }
}