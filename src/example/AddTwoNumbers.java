package example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AddTwoNumbers {
    private static final Logger logger = Logger.getLogger(AddTwoNumbers.class.getName());
    public static void main(String [] args){
        int a= 10;
        int b= 20;
        int c=a+b;
        logger.log(Level.INFO, () -> a +"+" +b +"=" +c);
         }
}
