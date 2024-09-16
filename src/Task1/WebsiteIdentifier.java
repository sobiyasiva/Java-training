package Task1;
import java.util.Scanner;
public class WebsiteIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a website (e.g., abc.com, abc.org): ");
        String website = scanner.nextLine();
        if (!website.contains(".")) {
            System.out.println("Kindly provide a valid domain with an extension (e.g., .com, .org).");
        } else {
            String domainExtension = website.substring(website.lastIndexOf(".") + 1);
            if (domainExtension.equalsIgnoreCase("org")) {
                System.out.println("This website belongs to 'org' (Organization).");
            } else if (domainExtension.equalsIgnoreCase("com")) {
                System.out.println("This website belongs to 'com' (Commercial).");
            } else if (domainExtension.equalsIgnoreCase("in")) {
                System.out.println("This website belongs to 'in' (India).");
            } else if (domainExtension.equalsIgnoreCase("edu")) {
                System.out.println("This website belongs to 'edu' (Educational Institution).");
            } else if (domainExtension.equalsIgnoreCase("gov")) {
                System.out.println("This website belongs to 'gov' (Government).");
            } else if (domainExtension.equalsIgnoreCase("net")) {
                System.out.println("This website belongs to 'net' (Network).");
            } else {
                System.out.println("Unknown domain extension.");
            }
        }
        scanner.close();
    }
}