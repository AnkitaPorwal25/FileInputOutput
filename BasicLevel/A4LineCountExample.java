package BasicLevel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A4LineCountExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/data.txt";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int lineCount = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }

            System.out.println("Total number of lines in data.txt: " + lineCount);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filePath);
            e.printStackTrace();
        }
    }
}
//
//
//Write a program to count the number of lines in a text file called
//data.txt.