package test;

import java.util.Scanner;

public class ForStar {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = myObj.nextInt();
        System.out.println("Entered value is " + limit);
        int i;
        int j;
        for (i = 0; i <= limit; i++) {
            for (j =1; j <=limit-i ; j++) {
               System.out.print("*");
            }
         System.out.print("\n");
        }
    }
}