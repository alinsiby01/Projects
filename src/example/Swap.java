package example;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number(a): ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number(b): ");
        int b = scanner.nextInt();
        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("a="+a +"\n"+"b="+b);

    }
}
