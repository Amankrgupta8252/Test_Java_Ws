import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;  
import java.time.ZoneId;
import java.time.ZonedDateTime;  

public class java_timeline {
    public static void main(String[] args) {  
        // Change Date  
        LocalDate date = LocalDate.now();  
        LocalDate newDate = date.plusDays(10);  
        System.out.println("New Date: " + newDate);  

        // Change Time  
        LocalTime time = LocalTime.now();  
        LocalTime newTime = time.plusHours(12);  
        System.out.println("New Time: " + newTime);  

        // Change Date and Time  
        LocalDateTime dateTime = LocalDateTime.now();  
        LocalDateTime newDateTime = dateTime.minusDays(1).plusHours(12);  
        System.out.println("New DateTime: " + newDateTime);  

        // Change Zoned Date and Time to Kolkata, India
        ZonedDateTime zonedDateTime = ZonedDateTime.now();  
        ZonedDateTime newZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("New Zoned DateTime: " + newZonedDateTime);  
    }  
}
