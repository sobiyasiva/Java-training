import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Operations {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
        // ------------------------------------------------------
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write("Hello! This is a message written to the file.");
            myWriter.close();           
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: Unable to write to file.");
            e.printStackTrace();
        }
    }
}
