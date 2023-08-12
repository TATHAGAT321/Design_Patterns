package Singelton;

public class SingletonDemo {
    private static  SingletonDemo singletonDemo = new SingletonDemo();
    SingletonDemo(){
        this.counter = counter + 1;
    }
    public int counter;
    public static SingletonDemo getInstance() {
        return singletonDemo;
    }
    public SingletonDemo(int counter){
        this.counter = counter;
    }
    public void print(){
        System.out.println("Instance " + counter);
    }

}
