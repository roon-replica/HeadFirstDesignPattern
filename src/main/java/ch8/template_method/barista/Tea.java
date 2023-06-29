package ch8.template_method.barista;

public class Tea {
    void prepareRecipe() {
        boilWater();
        brewTea();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void brewTea() {
        System.out.println("brewing tea");
    }

    public void pourInCup() {
        System.out.println("pouring coffee in the cup");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }
}
