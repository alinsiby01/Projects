package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int a = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int[] numberArray = new int[a];
        for (int i=0;i<a;i++){
            numberArray[i] = scanner.nextInt();
        }
        /*int[] numberArray = {53,24,54,99,34};*/
        /*Arrays.sort(numberArray);*/
        int temp;
        /*int a = numberArray.length;*/
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                if(numberArray[i] < numberArray[j]) {
                    temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println("Sorted Integer Array is: ");
        for (int number:numberArray) {
            System.out.println(number);
        }


        System.out.println("Enter the number of names: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements: ");
        String[] names = new String[n];
        for (int i=0;i<a;i++){
            names[i] = scanner.next();
        }
        /*String[] names = {"John", "Mary", "Bob", "Alice", "David"};
        *//*Arrays.sort(names);*//*
        int n = names.length;*/
        String tempVar;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    tempVar = names[i];
                    names[i] = names[j];
                    names[j] = tempVar;
                }
            }
        }
        System.out.println("Sorted String Array is: ");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Enter limit: ");
        int l = scanner.nextInt();
        System.out.println("Enter "+l+" names ");
        String[] arr = new String[l];
        for (int i=0; i<l;i++){
            System.out.println("Enter the name "+(i+1)+": ");
            arr[i] = scanner.next();
        }
        Arrays.sort(arr);
        for (String t: arr) {
            System.out.println(t);
        }
    }
}
