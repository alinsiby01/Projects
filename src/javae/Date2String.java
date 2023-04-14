package javae;

import java.time.LocalDate;
import java.util.Scanner;

public class Date2String {
    public static void main(String[] args) {
       /* LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        String strDate = getFormattedDate(date);
        System.out.println("Converted to string is " + strDate);
    }
        private static String getFormattedDate (LocalDate char dt)
        {
            DateTimeFormatter df1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        //Getting the given date value
        LocalDate givenDate = LocalDate.of(year, month, day);
        //Converting given date to String
        String date = givenDate.toString();
        System.out.println("Given date :" + date);
    }
}