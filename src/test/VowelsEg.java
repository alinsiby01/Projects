package test;

import java.util.Scanner;

public class VowelsEg {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entre the operator ");
        String operator = myObj.nextLine();
        System.out.println("Operator is"+operator);
        int a=4;
        int b=2;
        switch (operator) {
            case "+" : System.out.println("Sum= "+(a+b)); break;
            case "-" : System.out.println("Subtraction= "+(a-b)); break;
            case "*" : System.out.println("Multiplication= "+(a*b)); break;
            case "/" : System.out.println("Division= "+(a/b)); break;
            default : System.out.println("Default operator");
        }
    }
}
