package files;

import java.io.*;

/**
 * Created by patrick.duff on 11/1/2018.
 */
public class Read {
    public static void main(String[] args) {
        // 1. Define the file we want to read
        String filename = ""; //The path to the file we're reading from
        String text = null;

        // 2. Create the file in Java
        File file = new File(filename);
        try {
            // 3. Open the file
            BufferedReader br = new BufferedReader(new FileReader(file));
            // 4. Read the file
            text = br.readLine();
            // 5. Close the file
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found: " + filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: could not read the data: " + filename);
            e.printStackTrace();
        } finally {
            System.out.println("Finished reading the file");
        }

        System.out.println(text);


    }
}
