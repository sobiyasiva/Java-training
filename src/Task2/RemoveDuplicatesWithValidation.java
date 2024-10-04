package Task2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesWithValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Enter the value:");
            input = scanner.nextLine().trim();

            
            if (input.isEmpty()) {
                System.out.println("Input should not be empty. Please try again.");
                continue;
            }

            
            if (!input.matches("^[0-9\\s,]+$")) {
                System.out.println("Input contains invalid characters. Please try again.");
                continue;
            }

            
            isValidInput = true;

            
            input = input.replace(",", " "); 
            String[] inputArray = input.split("\\s+"); 

            
            String[] uniqueArray = removeDuplicates(inputArray);

            
            if (inputArray.length == uniqueArray.length) {
                System.out.println("No duplicates found.");
            } else {
                System.out.println("After removing duplicates: " + Arrays.toString(uniqueArray));
            }
        }

        scanner.close();
    }

    public static String[] removeDuplicates(String[] array) {
        Set<String> uniqueSet = new LinkedHashSet<>();
        for (String element : array) {
            uniqueSet.add(element);  
        }
        return uniqueSet.toArray(new String[0]);
    }
}
