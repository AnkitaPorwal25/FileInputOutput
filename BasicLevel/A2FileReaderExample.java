package BasicLevel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A2FileReaderExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/input.txt";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            System.out.println("Contents of input.txt:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filePath);
            e.printStackTrace();
        }
    }
}

//
//Write a program to read and print the contents of a file named
//input.txt.