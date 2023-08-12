package Adapter;

public class WeightInKg implements AdapterInterface {
    AdapteInterface adaptee;
    public WeightInKg(AdapteInterface adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public double getWeight() {
        return (adaptee.getWeight() * 0.45);
    }
}
