package exception;

public class ThrowEg {
    public static void main(String[] args)
    {
        int no=10;
        try
        {
            test();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("\n caught the exception");
            System.out.println(ae);
            System.out.println("Division by zero is not possible");
        }

    }
    public static void test() throws ArithmeticException
    {
        int div=10/0;
        throw new ArithmeticException();
    }
}
