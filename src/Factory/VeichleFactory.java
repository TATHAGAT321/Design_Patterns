package Factory;

import static java.lang.constant.ConstantDescs.NULL;

public class VeichleFactory {
    private Veichle veichle;

    public Veichle getVeichle(String veichleType) {
        if(veichleType == "car") {
            this.veichle = new Car();
        } else if(veichleType == "bus") {
            this.veichle = new Bus();
        } else if(veichleType == "train") {
            this.veichle = new Train();
        } else {
            System.out.println("This is not valid veichle type");
        }
        return veichle;
    }

}
