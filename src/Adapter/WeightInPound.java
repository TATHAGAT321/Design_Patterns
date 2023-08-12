package Adapter;

public class WeightInPound implements AdapteInterface {
    int pounds;
    public WeightInPound(int weight){
        this.pounds = weight;
    }
    @Override
    public int getWeight(){
        return pounds;
    }
}
