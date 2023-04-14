package exception;

import java.util.logging.Logger;

public class FinallyEg {
    public static final Logger logger = Logger.getLogger(FinallyEg.class.getName());
    public static void main(String[] args)
    {
        int[] ary ={1,2,3,4,};
        try
        {
            System.out.println(ary[5]);
            logger.info("This will not print");
        }
        catch(Exception e)
        {
            logger.info("Caught the exception");
            logger.info("Trying to access an invalid array location");
        }
        finally {
            assert logger != null;
            logger.info("An exception occurred or not this will print");
        }
    }
}
