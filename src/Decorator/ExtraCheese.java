package Decorator;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(BasePizza base) {
        this.base = base;
    }
    @Override
    public int calculatePrice() {
        return base.price + 60;
    }
}
