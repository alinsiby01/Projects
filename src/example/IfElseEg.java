package example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IfElseEg {
    private static final Logger logger = Logger.getLogger(IfElseEg.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Entre the limit:");
        int limit = scanner.nextInt();
        logger.log(Level.INFO,() -> "Entered value is " + limit);
        int os = 0;
        int es = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                es = es + i;
            } else {
                os = os + i;
            }
        }
        int finalEs = es;
        logger.log(Level.INFO,() -> "Even sum="+ finalEs);
        int finalOs = os;
        logger.log(Level.INFO,() -> "Odd sum= "+ finalOs);
    }
}