package javae;

abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Main{
    public static void main(String [] args){
        Animal animal;
        animal = new Pig();
        animal.animalSound();

    }
}

