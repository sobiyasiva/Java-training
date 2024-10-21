package Task2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        String input;
        boolean isValidInput = false;
        
        while (!isValidInput) {
            System.out.println("Enter the value:");
            input = scanner.nextLine();
            
            if (input.isEmpty()) {
                System.out.println("Input should not be empty. Please try again.");
                continue;
            }
            if (!input.matches("^[\\S\\s]*[a-zA-Z]+[\\S\\s]*$")) {
                System.out.println("Input contains only special characters or multiple spaces. Please try again.");
                continue;
            }
            
            isValidInput = true;
            input = input.toLowerCase();
            Map<Character, Integer> charCount = new HashMap<>();
            
            for (char ch : input.toCharArray()) {
                if (ch != ' ') {  
                    charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                }
            }
            
            System.out.println("Character counts:");
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        
        scanner.close();
    }
}
