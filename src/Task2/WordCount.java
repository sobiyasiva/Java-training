package Task2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        String input;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter a sentence: ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input should not be empty. Please try again.");
                continue;
            }
            if (!input.matches("[a-zA-Z\\s]+")) {
                System.out.println("Input contains numbers or special characters.Please try again.");
                continue;
            }
            isValidInput = true;
            String[] words = input.split("\\s+"); 
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            System.out.println("Word counts: " + wordCount);
        }
        scanner.close();
    }
}