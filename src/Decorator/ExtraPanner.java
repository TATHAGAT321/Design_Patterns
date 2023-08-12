package Decorator;

public class ExtraPanner extends PizzaDecorator{

    public ExtraPanner(BasePizza base){
        this.base = base;
    }

    @Override
    public int calculatePrice() {
        return base.price + 80;
    }
}
