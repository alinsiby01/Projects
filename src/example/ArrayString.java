package example;

import java.util.logging.Logger;

public class ArrayString {
    public static final Logger logger = Logger.getLogger(ArrayString.class.getName());
    public static void main(String [] args){
        String[] names = {"Alin","Sanoop"};
        logger.info("-----Using for-----");
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }

        logger.info("-----Using foreach-----");
        for (String name:names) {
            System.out.println(name);
        }
    }
}
