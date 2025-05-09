package IntermediateLevel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A8CsvUpperCaseExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/employees.csv";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Convert the line to uppercase and print it
                System.out.println(line.toUpperCase());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filePath);
            e.printStackTrace();
        }
    }
}
