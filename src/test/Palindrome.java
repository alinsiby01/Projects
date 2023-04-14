package test;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number:");
        int num = scanner.nextInt();
        //System.out.println("Entered number is " + num);

        int sum = 0;
        int r;
        int n = num;
        while (num > 0)
        {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (n == sum)
        {
            System.out.println(n+" is a palindrome");
        }
        else
        {
            System.out.println(n+" is not a palindrome");
        }
    }
}
