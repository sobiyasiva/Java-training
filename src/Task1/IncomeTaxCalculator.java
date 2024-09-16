package Task1;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long salary = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter your annual salary: ");
            String input = scanner.nextLine().trim();  
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid salary.");
            } else if (!input.matches("\\d+")) { 
                System.out.println("Invalid input! Letters and special characters are not allowed");
            } else {
                try {
                    salary = Long.parseLong(input);  
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Number is too large. Please enter a valid number within the acceptable range.");
                }
            }
        }
        long tax = 0;
        String percentage = "";
        if (salary > 250000 && salary <= 500000) { 
            tax = salary * 5 / 100;  
            percentage = "5%";
        } else if (salary > 500000 && salary <= 1000000) {
            tax = salary * 10 / 100;  
            percentage = "10%";
        } else if (salary > 1000000) {
            tax = salary * 15 / 100; 
            percentage = "15%";
        } else {
            System.out.println("You are not eligible to pay tax.");
            scanner.close();
            return;
        }
        System.out.println("You have to pay "+"(" + tax +") " + percentage + " of tax.");       
        scanner.close();
    }
}
