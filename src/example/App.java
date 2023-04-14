package example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String []args){
        String str1 = "Java";
        String str2 = new  String("java");
        if  (str1.equalsIgnoreCase(str2))
        {
            logger.log(Level.INFO, () -> "Equal");
        } else {
            logger.log(Level.INFO, () -> "Not equal");
        }
    }
}
