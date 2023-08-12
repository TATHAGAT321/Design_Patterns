package AbstractFactory;

public class HondaBike implements Veichle {
    @Override
    public void drive() {
        System.out.println("I'm driving a Honda bike");
    }
}
