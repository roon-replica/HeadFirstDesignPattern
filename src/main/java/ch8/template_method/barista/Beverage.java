package ch8.template_method.barista;

public abstract class Beverage {
    final void prepareRecipe() { // final로 틀을 고정, 강제하는..! 템플릿 메소드라 불리는 이유!
        boilWater();
        brew();
        pourInCup();
        addComplements();
    }

    public abstract void brew();

    public abstract void addComplements();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring beverage in the cup");
    }
}
