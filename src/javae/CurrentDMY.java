package javae;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrentDMY {
    public static final Logger logger = Logger.getLogger(CurrentDMY.class.getName());
    public static void main(String[] args) {
            LocalDate date = LocalDate.now();
            logger.log(Level.INFO,() ->"Current date: "+date);
            Year year = Year.from(date);
            logger.log(Level.INFO,() ->"Year: "+year);
            Month month = Month.from(date);
            logger.log(Level.INFO,() ->"Month: "+month);
            int day = date.getDayOfMonth();
            logger.log(Level.INFO,() ->"Day: "+day);
    }
}
