package Builder;

public class Computer {
    String desktop;
    String mouse;
    String keyBoard;
    String ramSize;
    String graphics;
    Computer(PcBuilder builderInstance) {
        this.desktop = builderInstance.desktop;
        this.mouse = builderInstance.mouse;
        this.keyBoard = builderInstance.keyBoard;
        this.ramSize = builderInstance.ramSize;
        this.graphics = builderInstance.graphicCard;
    }

    @Override
    public String toString(){//overriding the toString() method
        return "<------ SPECIFICATION ------>" + "\n" + desktop +"\n"+ mouse +"\n"+ keyBoard +"\n"+ ramSize +"\n"+ graphics;
    }
    public void getSpecification() {
        System.out.println(this);
    }
}
