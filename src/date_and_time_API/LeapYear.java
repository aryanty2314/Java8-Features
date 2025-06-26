package date_and_time_API;

import java.time.Year;

public class LeapYear
{
    public static void main(String[] args)
    {

        Year year = Year.of(2020);
        if (year.isLeap())
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
