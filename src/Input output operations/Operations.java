import java.io.File;//used to check if the file exists
import java.io.FileNotFoundException;//subclass of IO Exception that indicates file not found error
import java.util.Scanner;
import java.io.FileWriter;//used to write data to the file either by appending or overwriting
import java.io.IOException;//general exception for I/O issues
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
