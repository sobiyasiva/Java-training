package Task1;
import java.util.Scanner;
public class NameCheckVowel {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine().trim();  
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            } else if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Numbers and special characters are not allowed.");
            } else {
                break;  
            }
        }
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        char lastChar = firstName.charAt(firstName.length() - 1);  
        if (isVowel(lastChar)) {
            System.out.println("The last letter of the first name is a vowel at index(" + (firstName.length() - 1) + ").");
        } else {
            System.out.println("The last letter of the first name is not a vowel.");
        }
        scanner.close();
    }
}
