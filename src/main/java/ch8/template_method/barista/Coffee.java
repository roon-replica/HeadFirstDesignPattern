package ch8.template_method.barista;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void brewCoffee() {
        System.out.println("brewing coffee");
    }

    public void pourInCup() {
        System.out.println("pouring coffee in the cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
