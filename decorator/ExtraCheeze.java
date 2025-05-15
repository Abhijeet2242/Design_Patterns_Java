package Low_level_design.decorator;

public class ExtraCheeze extends ToppingDecorator{
    Pizza pizza;

    public ExtraCheeze(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return this.pizza.getCost() + 30;
    }
}
