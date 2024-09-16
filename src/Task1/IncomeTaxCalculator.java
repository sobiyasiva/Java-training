package Task1;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual salary (in lakhs): ");
        double salaryInLakhs = scanner.nextDouble();  
        double tax = 0;
        if (salaryInLakhs > 2.5 && salaryInLakhs <= 5.0) {
            tax = salaryInLakhs * 0.05;  
        } else if (salaryInLakhs > 5.0 && salaryInLakhs <= 10.0) {
            tax = salaryInLakhs * 0.10;  
        } else if (salaryInLakhs > 10.0) {
            tax = salaryInLakhs * 0.15; 
        } else {
            System.out.println("You are not eligible to pay tax.");
            scanner.close();
            return; 
        }
        tax = Math.round(tax * 100.0) / 100.0; 
        if (tax < 1) {
            double taxInThousands = tax * 100; 
            System.out.println("You have to pay " + taxInThousands + " thousands as tax.");
        } else {
            System.out.println("You have to pay " + tax + " lakhs as tax.");
        }       
        scanner.close();
    }
}
