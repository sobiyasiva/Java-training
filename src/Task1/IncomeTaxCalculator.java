package Task1;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual salary (in lakhs): ");
        double salary = scanner.nextDouble();
        double tax = 0;
        if (salary > 2.5 && salary <= 5.0) {
            tax = salary * 0.05; 
            tax = Math.round(tax * 100.0) / 100.0; 
            System.out.println("You have to pay " + tax + " lakhs as tax (5%).");
        } else if (salary > 5.0 && salary <= 10.0) {
            tax = salary * 0.10; 
            tax = Math.round(tax * 100.0) / 100.0; 
            System.out.println("You have to pay " + tax + " lakhs as tax (10%).");
        } else if (salary > 10.0) {
            tax = salary * 0.15; 
            tax = Math.round(tax * 100.0) / 100.0; 
            System.out.println("You have to pay " + tax + " lakhs as tax (15%).");
        } else {
            System.out.println("You are not eligible to pay tax.");
        }
        scanner.close();
    }
}
