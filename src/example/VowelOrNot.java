package example;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet;
        do {
            System.out.print("Enter an alphabet: ");
            alphabet = scanner.next().toLowerCase().charAt(0);
        }
        while (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u');
            System.out.println(alphabet + " is not a vowel");
        }
    }
