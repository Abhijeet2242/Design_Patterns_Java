package Low_level_design.decorator;

public class ExtraVeggie extends ToppingDecorator{
    Pizza pizza;

    public ExtraVeggie(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 50;
    }
}
