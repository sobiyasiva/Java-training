package Task2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesWithValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Enter the value : ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input should not be empty.");
                continue;
            }
            if (!input.matches("^[a-zA-Z0-9 ]+$")) {
                System.out.println("Input contains special characters. Please try again.");
                continue;
            }
            if (!input.contains(" ") && input.length() > 1) {
                System.out.println("Multiple elements should be space-separated. Please try again.");
                continue;
            }
            isValidInput = true;
            String[] inputArray = input.split("\\s+");
            String[] uniqueArray = removeDuplicates(inputArray);
            if (inputArray.length == uniqueArray.length) {
                System.out.println("No duplicates found.");
            } else {
                System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
            }
        }

        scanner.close();
    }
    public static String[] removeDuplicates(String[] array) {
        List<String> list = Arrays.asList(array);
        Set<String> uniqueSet = new LinkedHashSet<>(list);
        return uniqueSet.toArray(new String[0]);
    }
}