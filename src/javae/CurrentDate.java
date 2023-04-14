package javae;
import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentDate {
    public static void main(String[] args){
    LocalDate date= LocalDate.now();
    System.out.println("Current date: "+date);

    LocalTime time= LocalTime.now();
    System.out.println("Current time: "+time);
    }
}
