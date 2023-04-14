package test;

public class OverrideSample {
    void run(){System.out.println("Vehicle is running");}
}
class Bike2 extends OverrideSample{
    //defining the same method as in the parent class
    @Override
    void run(){System.out.println("Bike is running safely");}

    public static void main(String[] args){
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
