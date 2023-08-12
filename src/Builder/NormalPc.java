package Builder;

public class NormalPc extends PcBuilder {
    @Override
    public PcBuilder setGraphics(){
        this.graphicCard = "NVIDIA GV100 32GB";
        return this;
    }
    @Override
    public PcBuilder setRam() {
        this.ramSize = "16GB";
        return this;
    }
}
