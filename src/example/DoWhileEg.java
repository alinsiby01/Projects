package example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoWhileEg {
    private static final Logger logger = Logger.getLogger(DoWhileEg.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Entre the limit:");
        int limit = scanner.nextInt();
        logger.log(Level.INFO, () ->"Entered value is " + limit);

        int i = 0;
        int sum = 0;
        do {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        while (i <= limit);
        int finalSum = sum;
        logger.log(Level.INFO, () ->"Sum is " + finalSum);
    }
}
