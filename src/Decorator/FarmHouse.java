package Decorator;

public class FarmHouse extends BasePizza {
    @Override
    public int calculatePrice() {
        this.price = 300;
        return this.price;
    }
}
