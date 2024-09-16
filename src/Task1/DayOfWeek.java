package Task1;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
            input = scanner.nextLine().trim();  
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid number.");
            } else if (!input.matches("\\d+")) {
                System.out.println("Invalid input! Numbers and special characters are not allowed");
            } else {
                int dayNumber = Integer.parseInt(input);  
                if (dayNumber < 1 || dayNumber > 7) {
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
                } else {
                    switch (dayNumber) {     
                        case 1:
                            System.out.println("The entered day of the week is Sunday");
                            break;
                        case 2:
                            System.out.println("The entered day of the week is Monday");
                            break;
                        case 3:
                            System.out.println("The entered day of the week is Tuesday");
                            break;
                        case 4:
                            System.out.println("The entered day of the week is Wednesday");
                            break;
                        case 5:
                            System.out.println("The entered day of the week is Thursday");
                            break;
                        case 6:
                            System.out.println("The entered day of the week is Friday");
                            break;
                        case 7:
                            System.out.println("The entered day of the week is Saturday");
                            break;
                    }
                    break; 
                }
            }
        }
        scanner.close();
    }
}
