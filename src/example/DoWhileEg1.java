package example;

import java.util.Scanner;
import java.util.logging.Logger;

public class DoWhileEg1 {
    public static final Logger logger = Logger.getLogger(DoWhileEg1.class.getName());
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            logger.info("Enter a number : ");
            value = scanner.nextInt();
        }
       while (value != 5);
       logger.info("Got 5!");
    }
}
