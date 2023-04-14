package javae;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeapYearEg {
    public static final Logger logger = Logger.getLogger(LeapYearEg.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Entre the year:");
        int yr = scanner.nextInt();
        logger.log(Level.INFO,() -> "Entered year is " + yr);
        if (yr % 4==0)
        {
            logger.log(Level.INFO,() -> yr+ " is a leap year");
        }
        else
        {
            logger.log(Level.INFO,() -> yr+ " is not a leap year");
        }
    }
}
