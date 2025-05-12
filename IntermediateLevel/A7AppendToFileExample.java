package IntermediateLevel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A7AppendToFileExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/log.txt";

        // Get the current date
        String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        // Create the message to append
        String message = "Last updated on " + currentDate;

        try {
            // Open the file in append mode (true for append)
            FileWriter fileWriter = new FileWriter(filePath, true);

            // Write the message to the file
            fileWriter.write(message + "\n");

            // Close the file
            fileWriter.close();

            System.out.println("Line appended successfully to log.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
//
//
//Write a program to append the line “Last updated on [current
//date]” to an existing file log.txt.