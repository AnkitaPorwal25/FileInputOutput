package BasicLevel;
import java.io.File;

public class A3FileCheckExample {
    public static void main(String[] args) {
        String filePath = "src/TextFiles/report.pdf";

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File found: " + filePath);
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File not found: " + filePath);
        }
    }
}

//
//Write a program that checks if a file named report.pdf exists in
//the current directory and prints its size (in bytes).