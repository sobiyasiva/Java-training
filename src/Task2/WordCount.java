package Task2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter a sentence (letters, spaces, and special characters are allowed):");
        
        String input = scanner.nextLine().trim();

        
        if (input.isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty sentence.");
            scanner.close();
            return; 
        }

        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : input.split("\\s+")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        
        System.out.println("Word counts: " + wordCount);
        scanner.close();
    }
}
