package date_and_time_API;

import java.time.LocalDate;

public class date
{
    public static void main(String[] args)
    {
        System.out.println("------------------------------------------------------------------");

        // Display the current date
        // LocalDate is used to represent a date without a time
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Display the Day of the Month
        System.out.println(date.getDayOfMonth());

        // Display the month of the year
        int mm = date.getMonthValue();

        // Display the day of the month
        int dd = date.getDayOfMonth();

        // Display the year
        int yyyy = date.getYear();

        String day = date.getDayOfWeek().toString();
        System.out.println("Day of the Week: " + day);

        
        // Print the date in the format mm/dd/yyyy
        System.out.println("Current Date: " + mm + "/" + dd + "/" + yyyy);

    }
}
