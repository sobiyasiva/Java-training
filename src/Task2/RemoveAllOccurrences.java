package Task2;
import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter the value :");
            input = scanner.nextLine().trim();  
            if (input.isEmpty()) {
                System.out.println("Input should not be empty. Please try again.");
                continue;
            }
            if (!input.matches("^[a-zA-Z0-9,\\s]+$")) {
                System.out.println("Input contains invalid characters. Please try again.");
                continue;
            }
            isValidInput = true;
            System.out.println("Enter the value to be removed :");
            String key = scanner.nextLine().trim();
            if (key.isEmpty() || !key.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("Key should not be empty.");
                continue;
            }
            String resultString = removeOccurrences(input, key);
            if (input.equals(resultString)) {
                System.out.println("The substring \"" + key + "\" was not found in the input.");
            } else {
                System.out.println("String after removing all occurrences of \"" + key + "\": " + resultString);
            }
        }
        scanner.close();
    }

    public static String removeOccurrences(String input, String key) {
        return input.replace(key, "");
    }
}

