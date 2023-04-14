package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadArrayList {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> values = new ArrayList<>();
            System.out.println("Enter the limit: ");
            int n = sc.nextInt();
            Scanner scanner = new Scanner(System.in);
            for (int i= 0; i<n;i++)
            {
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();
                values.add(input);
            }
            Collections.sort(values);
            System.out.println("Ascending order: ");
            printList(n,values);
            Collections.sort(values,Collections.reverseOrder());
            System.out.println("Descending Order: ");
            printList(n,values);
        }

        public static void printList(int n, ArrayList<String> values){
            for (int i=0; i < n; i++)
                System.out.println(values.get(i));
        }
}
