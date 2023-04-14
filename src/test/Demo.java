package test;

public class Demo {
    public static void main(String [] args) {
        /*int luck = 10;
        if((luck>10 ? luck++: --luck)<10){
            System.out.print("Bear");
        }
        if(luck<10)
            System.out.print("Shark");
    }*/

        String ta = "A";
        ta = ta.concat("B");
        String tb = "C";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
