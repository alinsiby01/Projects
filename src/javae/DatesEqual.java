package javae;
import java.time.LocalDate;
import java.util.Scanner;

public class DatesEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        LocalDate dateOne = LocalDate.now();
        LocalDate dateTwo = LocalDate.of(year, month, day);
        System.out.println("Current date = " + dateOne);
        System.out.println("Given date = " + dateTwo);
        if (dateOne.equals(dateTwo))
        {
            System.out.println("Both the dates are same!");
        }
        else{
            System.out.println("The dates are not equal");
        }
    }
}