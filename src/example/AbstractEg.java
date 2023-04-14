package example;

abstract class Car{
    abstract void drive();
    public void colour(){
        System.out.println("White");
    }
}
class Ford extends Car{
    void drive(){System.out.println("Driving Ford");}
}

class Swift extends Car{
    void drive(){System.out.println("Driving Swift");}
}
class AbstractEg{
    public static void main(String[] args){
        Car car1 =new Ford();
        car1.drive();
        car1.colour();
        Car car2 = new Swift();
        car2.drive();
        car2.colour();
    }
}
