package Decorator;

public class VeggieDelight extends BasePizza{
    @Override
    public int calculatePrice() {
        this.price = 250;
        return this.price;
    }
}
