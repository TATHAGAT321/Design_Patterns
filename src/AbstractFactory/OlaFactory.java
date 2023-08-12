package AbstractFactory;

public class OlaFactory {
Veichle veichle;
        OlaFactory (String veichleType) {
            if(veichleType.equals("bike")) {
                veichle = new OlaBike();
            } else {
                veichle = new OlaCar();
            }
        }
        Veichle getVeichle() {
            return veichle;
        }
}
