package test;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number or string:");
        String text = scanner.nextLine();
        int l = text.length();
        String reverse ="";
        for (int i=(l-1);i>=0;i--){
            reverse = reverse + text.charAt(i);
        }
        if(text.equals(reverse)){
            System.out.println(text + " is palindrome ");
        }
        else {
            System.out.println(text + " is not palindrome ");
        }
    }
}
