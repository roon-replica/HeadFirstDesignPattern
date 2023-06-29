package ch8.template_method.barista_hook;

public abstract class BeverageWithHook {
    final void prepareRecipe() { // final로 틀을 고정, 강제하는..! 템플릿 메소드라 불리는 이유!
        boilWater();
        brew();
        pourInCup();
        if (customerWantsComplements()) {
            addComplements();
        }
    }

    public abstract void brew();

    public abstract void addComplements();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pouring beverage in the cup");
    }

    // this is hook.
    // do nothing special.
    // subclass can override the hook if it needs
    public boolean customerWantsComplements() {
        return true;
    }
}
