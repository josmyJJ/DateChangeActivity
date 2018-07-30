package src.com.company;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateChangeActivity {
    public static void main(String[] args) {
        // Declare variables
        Date now;
        DateFormat dateFormatter;
        String dateOut;

        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT);
        now = new Date();
        dateOut = dateFormatter.format(now);
        System.out.print("Date: ");
        System.out.println(dateOut);

        // GregorianCalendar to get the date
        GregorianCalendar gc = new GregorianCalendar();
        System.out.print("Time: ");
        System.out.print(gc.get(Calendar.HOUR)+":");
        System.out.print(gc.get(Calendar.MINUTE)+":");
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println();

        System.out.println("*****Date Time in Java8*******");
        // Java 8 Date and Time
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate date1 = currentTime.toLocalDate();
        LocalTime date2 = currentTime.toLocalTime();
        System.out.println("Current Date: " + date1);
        System.out.println("Current Time: " + date2);


    }
}
