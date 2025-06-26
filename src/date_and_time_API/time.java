package date_and_time_API;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class time
{
    public static void main(String[] args)
    {

        // LocalTime represents a time without a date
        // It can be used to represent a time of day, such as 10:30:45
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // we can also create a specific time
        LocalTime specificTime = LocalTime.of(10, 30, 45);
        System.out.println("Specific Time: " + specificTime);

        int hh = time.getHour();
        int mm = time.getMinute();
        int ss = time.getSecond();
        int nn = time.getNano();

        System.out.println("Time in HH:MM:SS.NNNNNNN format: " + String.format("%02d:%02d:%02d.%05d", hh, mm, ss, nn));

        // ZoneId represents a time zone
        // It can be used to represent a specific time zone, such as America/Los_Angeles
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Current Zone : " + zone);

        // ZonedDateTime represents a date and time with a time zone
        // It can be used to represent a specific date and time in a specific time zone
        ZoneId los = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ZonedDateTime.now(los);
        System.out.println("Current Time in Los Angeles: " + zdt.toLocalTime());


    }
}
