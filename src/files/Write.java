package files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by patrick.duff on 11/1/2018.
 */
public class Write {
    public static void main(String[] args) {
        // 1. Define a path that we want to write
        String filename = ""; //the path to the file that we're writing to
        String message = "I'm writing data that will be placed in a file";

        // 2. Create File in Java
        File file = new File(filename);

        try {
            // 3. Open the file
            FileWriter fw = new FileWriter(file);
            // 4. Write to a file
            fw.write(message);
            // 5. Close the resources
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR Could not read file: " + filename);
            e.printStackTrace();
        } finally {
            System.out.println("Closing the file writer");
        }

    }
}
