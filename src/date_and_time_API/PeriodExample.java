package date_and_time_API;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample
{
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2003, 9, 23);

        // Calculate the period between two dates
        // This will calculate the period between the current date and the specified date
        // The Period class represents a period of time in terms of years, months, and days
        // The Period class is immutable and thread-safe

        Period p = Period.between(localDate2, localDate);
        System.out.println("Age: " + p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days");
    }
}
