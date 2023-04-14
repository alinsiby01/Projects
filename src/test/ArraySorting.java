package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = myObj.nextInt();
        int[] array = new int[limit];
        System.out.println("Enter the " + limit + " numbers");
        for (int i = 0; i < limit; i++) {
            array[i] = myObj.nextInt();
        }
        arraySort(array, limit);
    }

    private static void arraySort(int[] array, int limit) {
        int i;
        int j;
        System.out.print("Sorted array is ");
        for (i = 0; i < limit; i++) {
            for (j = i; j < limit; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i]+",");
        }
        Integer sample=2;
        System.out.println();
        System.out.println(sample.toString());
        String[] exp = {"1AB","12B","0AC"};
        Arrays.sort(exp);
        System.out.println(java.util.Arrays.toString(exp));
    }
}