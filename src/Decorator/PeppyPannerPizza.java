package Decorator;

public class PeppyPannerPizza extends BasePizza{
    @Override
    public int calculatePrice() {
        this.price = 350;
        return this.price;
    }
}
