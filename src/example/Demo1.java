package example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo1 {
    private static final Logger logger = Logger.getLogger(Demo1.class.getName());
    public static void main(String[] args) {
        String str="125.0";

        double prim=Double.parseDouble(str);
        double c=20+prim;
        logger.log(Level.INFO, () -> String.valueOf(c));
    }
}
