import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        File file = new File("notes.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Welcome to Java I/O operations.");
            writer.close();

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
