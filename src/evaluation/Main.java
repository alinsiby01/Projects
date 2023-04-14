package evaluation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        int sum = 0;
        if(n1==n2){
            System.out.println("Sum = " +n1);
        }
        else{
        if (n2>n1) {
            {
                for (int i = n1; i <= n2; i++) {
                    sum = sum + i;
                }
            }
        }
        else {
            for (int i = n2; i <= n1; i++) {
                sum = sum + i;
            }
        }
            System.out.println("Sum = "+sum);
        }
    }
}
