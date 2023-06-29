package ch8.template_method.barista;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addComplements() {
        System.out.println("adding sugar and milk");
    }
}