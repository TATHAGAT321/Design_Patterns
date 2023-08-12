package AbstractFactory;

public class HondaFactory {
    Veichle veichle;

    HondaFactory(String veichleType) {
        if(veichleType == "bike") {
            veichle = new HondaBike();
        } else {
            veichle = new HondaCar();
        }
    }
    Veichle getVeichle() {
        return veichle;
    }
}
