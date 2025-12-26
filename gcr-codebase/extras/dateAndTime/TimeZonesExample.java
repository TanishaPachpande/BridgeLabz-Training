import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample {
    public static void main(String[] args) {

	// using in-built method to get times of different timezones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

	// Displaying result
        System.out.println("Current Time in GMT : " + gmtTime);
        System.out.println("Current Time in IST : " + istTime);
        System.out.println("Current Time in PST : " + pstTime);
    }
}
