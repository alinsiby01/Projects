package test;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        System.out.println("Entered limit is " + limit);
        int i;
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (i =3; i <= limit; i++) {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
