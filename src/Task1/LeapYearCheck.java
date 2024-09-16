package Task1;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a 4-digit year: ");
            String input = scanner.nextLine().trim();  
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a 4-digit year.");
            } else if (!input.matches("\\d+")) {  
                System.out.println("Invalid input! Letters and special characters are not allowed");
            } else if (input.length() != 4) {  
                System.out.println("Invalid input! Please enter a 4-digit year.");
            } else {
                try {
                    year = Integer.parseInt(input); 
                    validInput = true;  
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid 4-digit year.");
                }
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
