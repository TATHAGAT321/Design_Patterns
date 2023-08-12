package Builder;

public class GamePC extends PcBuilder{
    @Override
    public PcBuilder setGraphics(){
        this.graphicCard = "NVIDIA 4090 300GB";
        return this;
    }
    @Override
    public PcBuilder setRam() {
        this.ramSize = "32GB";
        return this;
    }
}
