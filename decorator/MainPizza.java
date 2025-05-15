package Low_level_design.decorator;

public class MainPizza {
    public static void main(String[] args) {
        System.out.println("order pizza...!");
        Pizza pizza = new Margerrita();
        System.out.println(pizza.getCost());
        System.out.println("if you want to add anything you can add it");
        System.out.println("Adding extra cheexe ......");
        Pizza pizza1 = new ExtraCheeze(pizza);
        System.out.println("total cost now : " + pizza1.getCost());
    }
}
