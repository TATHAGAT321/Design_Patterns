package Builder;

public class PcDirector {

    public Computer createGamePC() {
        return new GamePC().setDesktop("Lenovo").setKeyBoard("Mechanical KeyBoard").setMouse("Gaming Mouse").setRam().setGraphics().getPc();
    }

    public Computer createNormalPC() {
        return new NormalPc().setDesktop("Apple").setKeyBoard("Mac Keyword").setMouse("Wireless Mouse").setRam().setGraphics().getPc();
    }


}
