package test;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = myObj.nextInt();
        int[] a = new int[limit];
        System.out.println("Enter the " + limit + " numbers");
        for (int i = 0; i < limit; i++) {
            a[i] = myObj.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        int x = myObj.nextInt();
        findPosition(a, limit, x);
    }

    private static void findPosition(int[] array, int limit, int x) {
        int i;
        boolean flag = false;
        for (i = 0; i < limit; i++) {
            if (array[i] == x) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("The element " + x + " is found at position " + (i + 1));
        } else {
            System.out.println("The element " + x + " is not found");
        }
    }
}