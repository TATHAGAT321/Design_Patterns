package Strategy;

public class FastDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("I'm driving at 100KM/H");
    }
}
