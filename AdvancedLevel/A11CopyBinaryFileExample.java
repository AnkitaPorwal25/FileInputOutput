package AdvancedLevel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A11CopyBinaryFileExample {
    public static void main(String[] args) {
        String sourceFilePath = "src/TextFiles/image.jpg";  // Source binary file
        String destinationFilePath = "src/TextFiles/image_copy.jpg";  // Destination file

        try (FileInputStream sourceFile = new FileInputStream(sourceFilePath);
             FileOutputStream destinationFile = new FileOutputStream(destinationFilePath)) {

            // Buffer to read data from the source file
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write the content in chunks
            while ((bytesRead = sourceFile.read(buffer)) != -1) {
                destinationFile.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully to " + destinationFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
