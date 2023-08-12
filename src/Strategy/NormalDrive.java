package Strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("I'm driving at speed of 60KM/H");
    }
}
