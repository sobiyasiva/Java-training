package Task1;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        while (true) {
            System.out.print("Enter a 4-digit year: ");
            year = scanner.nextInt();
            if (year >= 1000 && year <= 9999) {
                break; 
            } else {
                System.out.println("Invalid input! Please enter a 4-digit year.");
            }
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}

