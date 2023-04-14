package test;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entre the number:");
        int num = myObj.nextInt();
        System.out.println("Entered number is " + num);
        int i;
        int n = 0;
        if (num == 0 || num == 1) {
            System.out.println("It is not a prime number");
        } else {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    n = 0; break;
                } else {
                    n = 1;
                }
            }
            if (n == 0) {
                System.out.println("It is not a prime number");
            } else {
                System.out.println("It is a prime number");
            }
        }
    }
}
