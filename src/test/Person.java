package test;

public class Person {
    String name;
    int age = 25;

    public Person(String name){
        this();
        setName(name);
    }

    public Person() {

    }

    private void setName(String name) {
        // TODO document why this method is empty
    }

    public Person(String name,int age){
        new Person(name);
        setAge (age);
    }

    private void setAge(int age) {
        // TODO document why this method is empty
    }

    public String show(){
        String number = null;
        return name+" "+age+" "+ number;
    }
    public static void main(String [] args){
        Person p1= new Person("Jesse");
        Person p2= new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
