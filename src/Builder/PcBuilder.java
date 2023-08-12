package Builder;

import java.security.PublicKey;

public abstract class PcBuilder {
        String desktop;
        String mouse;
        String keyBoard;
        String ramSize;
        public String graphicCard;

        public PcBuilder setDesktop(String desktop) {
            this.desktop = desktop;
            return this;
        }
        public PcBuilder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }
        public PcBuilder setKeyBoard(String keyBoard) {
            this.keyBoard = keyBoard;
            return this;
        }
        public abstract PcBuilder setRam();

        public abstract PcBuilder setGraphics();

        public Computer getPc() {
            return new Computer(this);
        }
}
