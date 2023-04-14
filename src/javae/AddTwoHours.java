package javae;
import java.time.LocalTime;
import java.util.Scanner;

public class AddTwoHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Enter the seconds: ");
        int seconds = sc.nextInt();
        LocalTime time= LocalTime.now();
        LocalTime timeAdd= LocalTime.of(hours,minutes,seconds);
        System.out.println("Current time: "+time);
        System.out.println("Entered time to add: "+timeAdd);
        LocalTime newTime = time.plusHours(hours);
        System.out.println("After adding, the time is "+newTime);
    }
}
