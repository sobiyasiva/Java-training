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
            System.out.println("Enter the value :");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input should not be empty. Please try again.");
                continue;//skip the rest of the code and moves to the start of the loop
            }
            if (!input.matches("[a-zA-Z]+( [a-zA-Z]+)*")) {
                System.out.println("Input contains numbers, special characters, or multiple spaces. Please try again.");
                continue;
            }
            isValidInput = true;
            input = input.toLowerCase();
            Map<Character, Integer> charCount = new HashMap<>();
            for (char ch : input.toCharArray()) {//converts input string to character array
                if (ch != ' ') {  //helps to avoid space in character array
                    charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                    //character is present increment the count by 1 else 0 and finally it updates the count in the map
                }
            }
            System.out.println("Character counts:");
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                //Entry-each pair(key,value) from the set of all the key pair values
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        scanner.close();
    }
}