package BasicLevel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class A1FileWriterExample {
    public static void main(String[] args) {
        // Define directory and file path
        String directory = "src/TextFiles";
        String filename = directory + "/notes.txt";
        String content = "This is my first file in Java";

        try {
            // Ensure the directory exists
            File dir = new File(directory);
            if (!dir.exists()) {
                dir.mkdirs();  // create directories if they don't exist
            }

            // Write to the file
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully at " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}

//
//Write a program to create a new text file named notes.txt and
//write the line:
//        “This is my first file in Java.”