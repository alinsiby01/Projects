package javae;

interface Animals{
     void eat();
}
class Tiger implements Animals{
    @Override
    public void eat() {
        System.out.println("Tiger eats");
    }
}
abstract class Cat{
    abstract public void eat();
}
class Lion extends Cat{
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }
}

public class InterfaceAbstractEg {
    public static void main(String [] args){
        Animals tiger = new Tiger();
        tiger.eat();
        Cat lion = new Lion();
        lion.eat();
    }
}