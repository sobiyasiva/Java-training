package Task2;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveAllOccurrences {
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
            
            
            if (!input.matches("^[0-9,\\s]+$")) {
                System.out.println("Input contains invalid characters.Please try again.");
                continue;
            }
            
            
            isValidInput = true;
            
            
            System.out.println("Enter the number to remove:");
            String key = scanner.nextLine().trim();
            
            
            if (key.isEmpty() || !key.matches("^[0-9]+$")) {
                System.out.println("Key should not be empty and must be a valid number.");
                continue;
            }
            
            
            String[] elements;
            if (input.contains(",")) {
                elements = input.split("\\s*,\\s*");  
            } else {
                
                elements = input.split("");  
            }
            
            
            String[] resultArray = removeOccurrencesFromArray(elements, key);
            
            
            if (Arrays.equals(elements, resultArray)) {
                System.out.println("The number \"" + key + "\" was not found in the input.");
            } else {
                System.out.println("After removing all occurrences of \"" + key + "\": " + Arrays.toString(resultArray));
            }
        }
        scanner.close();
    }

    
    public static String[] removeOccurrencesFromArray(String[] inputArray, String key) {
        
        return Arrays.stream(inputArray)
                     .filter(element -> !element.equals(key))  
                     .toArray(String[]::new);  
    }
}