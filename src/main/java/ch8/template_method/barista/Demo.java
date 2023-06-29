package ch8.template_method.barista;

public class Demo {
    public static void main(String[] args) {
        var coffee = new Coffee();
        var tea = new Tea();

        coffee.prepareRecipe();
        System.out.println("-----------");
        tea.prepareRecipe();
    }
}
