package AbstractFactory;

public class VeichleShowroom {

    HondaFactory hondaProduct;
    OlaFactory olaProduct;
    String company;
    public VeichleShowroom(String company, String veichleType) {
        this.company = company;
        if(company.equals("Honda")) {
            if (veichleType.equals("bike"))
                hondaProduct = new HondaFactory("bike");
            else
                hondaProduct = new HondaFactory("car");
        } else {
            if (veichleType.equals("bike"))
                olaProduct = new OlaFactory("bike");
            else
                olaProduct = new OlaFactory("car");
        }
    }

    public Veichle getVeichle() {
        if(company.equals("Honda"))
            return hondaProduct.getVeichle();
        else
            return olaProduct.getVeichle();
    }

}
