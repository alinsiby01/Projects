package javae;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ParseDate {
    public static void main(String[] args) throws ParseException {
        // format date
        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Format Date...");
        System.out.println(shortFormat.format(new Date()));
        System.out.println(longFormat.format(new Date()));
        // parse date
        System.out.println("Parse Date...");
        Date d1 = shortFormat.parse("11/21/2018");
        System.out.println(d1);
    }
}
