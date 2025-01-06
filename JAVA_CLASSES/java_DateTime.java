import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_DateTime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        System.out.println();
         
        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);

        System.out.println();

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);
    }
}