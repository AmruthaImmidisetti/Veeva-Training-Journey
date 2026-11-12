import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered-notes.txt"))) {
            writer.write("Java I/O using BufferedWriter.");
            writer.newLine();
            writer.write("It writes text efficiently.");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
