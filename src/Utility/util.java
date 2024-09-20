package Utility;
import java.util.Date;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class util {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);
        // -------------------------------------------
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH); 
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                int minute = calendar.get(Calendar.MINUTE);
                System.out.println("Year: " + year);
                System.out.println("Month: " + (month + 1));  
                System.out.println("Day: " + day);
                System.out.println("Hour: " + hour);
                System.out.println("Minute: " + minute);

         // -------------------------------------------------------

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "test@example.com";
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
