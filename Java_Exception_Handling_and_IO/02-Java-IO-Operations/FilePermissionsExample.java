import java.io.File;

public class FilePermissionsExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        System.out.println("Read permission changed: " + file.setReadable(true));
        System.out.println("Write permission changed: " + file.setWritable(false));
        System.out.println("Executable permission changed: " + file.setExecutable(false));
    }
}
