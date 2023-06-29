package ch8.template_method.barista_hook;

public class HookDemo {
    public static void main(String[] args) {
        BeverageWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
